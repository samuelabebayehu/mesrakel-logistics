package et.samuel.mesrakellogistics.presentation.dto;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;
import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;
import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
public class ShipmentResponse {

    UUID id;
    String trackingNumber;
    String senderName;
    String recipientName;
    String contactPhone;
    Address shippingOrigin;
    Address shippingDestination;
    ShipmentStatus shippingStatus;
    ParcelDimensions parcelDimensions;
    Double weight;
    Money price;
    Instant createdAt;
    Instant updatedAt;
    String notes;
}
