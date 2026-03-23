package et.samuel.mesrakellogistics.presentation.dto;


import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;

import java.time.Instant;
import java.util.UUID;

public record ShipmentResponse(UUID id,
        String trackingNumber,
        String senderName,
        String recipientName,
        String contactPhone,
        AddressDto shippingOrigin,
        AddressDto shippingDestination,
        ShipmentStatus shippingStatus,
        ParcelDimensionsDto parcelDimensions,
        Double weight,
        MoneyDto price,
        Instant createdAt,
        Instant updatedAt,
        String notes) {


}
