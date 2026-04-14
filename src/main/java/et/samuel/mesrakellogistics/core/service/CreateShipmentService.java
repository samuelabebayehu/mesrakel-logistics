package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateShipmentService implements CreateShipmentUseCase {
    private final ShipmentRepositoryPort shipmentRepository;
    private final PricingService pricingService;

    @Override
    public Shipment createShipment(Shipment shipment) {
        shipment.initialize();
        shipment.validateForPricing();

        Money calculatedPrice = pricingService.calculatePrice(
                shipment.getParcelDimensions(),
                shipment.getWeight(),
                "ETB"
        );

        shipment.applyPricing(calculatedPrice);
        return shipmentRepository.create(shipment);
    }
}
