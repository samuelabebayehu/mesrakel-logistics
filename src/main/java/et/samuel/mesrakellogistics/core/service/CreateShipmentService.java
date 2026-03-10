package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateShipmentService implements CreateShipmentUseCase {
    private final ShipmentRepositoryPort shipmentRepository;

    @Override
    public Shipment create(Shipment shipment) {
        return null;
    }
}
