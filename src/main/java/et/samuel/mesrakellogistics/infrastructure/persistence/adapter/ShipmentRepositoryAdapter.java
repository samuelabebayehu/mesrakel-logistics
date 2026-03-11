package et.samuel.mesrakellogistics.infrastructure.persistence.adapter;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import et.samuel.mesrakellogistics.infrastructure.persistence.document.ShipmentDocument;
import et.samuel.mesrakellogistics.infrastructure.persistence.mapper.ShipmentPersistenceMapper;
import et.samuel.mesrakellogistics.infrastructure.persistence.repository.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentRepositoryAdapter implements ShipmentRepositoryPort {
    private final ShipmentRepository shipmentRepository;
    private final ShipmentPersistenceMapper shipmentPersistenceMapper;

    @Override
    public Shipment create(Shipment shipment) {

        ShipmentDocument shipmentDocument = shipmentPersistenceMapper.toDocument(shipment);
        shipmentRepository.save(shipmentDocument);
        return shipmentPersistenceMapper.toDomain(shipmentDocument);
    }
}
