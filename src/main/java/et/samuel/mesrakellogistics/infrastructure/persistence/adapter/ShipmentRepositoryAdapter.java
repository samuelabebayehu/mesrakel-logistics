package et.samuel.mesrakellogistics.infrastructure.persistence.adapter;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import et.samuel.mesrakellogistics.infrastructure.persistence.repository.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentRepositoryAdapter implements ShipmentRepositoryPort {
    private final ShipmentRepository shipmentRepository;

    @Override
    public Shipment create(Shipment shipment) {
        return null;
    }
}
