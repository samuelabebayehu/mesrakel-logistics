package et.samuel.mesrakellogistics.presentation.dto;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;
import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;
import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
public class CreateShipmentRequest {

    String senderName;
    String recipientName;
    String contactPhone;
    Address shippingOrigin;
    Address shippingDestination;
    ParcelDimensions parcelDimensions;
    Double weight;
    String notes;




}
