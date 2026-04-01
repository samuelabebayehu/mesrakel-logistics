package et.samuel.mesrakellogistics.infrastructure.persistence.mapper;

import et.samuel.mesrakellogistics.core.domain.Courier;
import et.samuel.mesrakellogistics.infrastructure.persistence.document.CourierDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourierPersistenceMapper {

    CourierDocument toDocument(Courier courier);
    Courier toDomain(CourierDocument courierDocument);
}
