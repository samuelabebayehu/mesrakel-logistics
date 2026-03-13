package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateShipmentService implements CreateShipmentUseCase {
    private final ShipmentRepositoryPort shipmentRepository;
    private final PricingService pricingService;

    @Override
    public Shipment create(Shipment shipment) {
        shipment.initialize();
        shipment.validateForPricing();

        Money calculatedPrice = pricingService.calculatePrice(
                shipment.getParcelDimensions(),
                shipment.getWeight(),
                "ETB"
        );

        shipment.setPrice(calculatedPrice);
        return shipmentRepository.create(shipment);
    }
}
