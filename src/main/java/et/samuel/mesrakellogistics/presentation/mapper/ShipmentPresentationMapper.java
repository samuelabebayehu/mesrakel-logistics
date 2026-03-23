package et.samuel.mesrakellogistics.presentation.mapper;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.presentation.dto.CreateShipmentRequest;
import et.samuel.mesrakellogistics.presentation.dto.ShipmentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ShipmentPresentationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "trackingNumber", ignore = true)
    @Mapping(target = "shippingStatus", ignore = true)
    @Mapping(target = "price", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "currentHubId", ignore = true)
    @Mapping(target = "assignedCourierId", ignore = true)
    Shipment toDomain(CreateShipmentRequest request);

    ShipmentResponse toResponse(Shipment shipment);
}
