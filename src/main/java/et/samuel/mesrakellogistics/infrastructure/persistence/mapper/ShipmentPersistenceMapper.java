package et.samuel.mesrakellogistics.infrastructure.persistence.mapper;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.infrastructure.persistence.document.ShipmentDocument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ShipmentPersistenceMapper {
    ShipmentDocument toDocument(Shipment shipment);
    Shipment toDomain(ShipmentDocument shipmentDocument);
}
