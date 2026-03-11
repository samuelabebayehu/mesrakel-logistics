package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;
import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {
    @EqualsAndHashCode.Include
    private UUID id;
    private String trackingNumber;
    private String senderName;
    private String recipientName;
    private String contactPhone;
    private Address shippingOrigin;
    private Address shippingDestination;
    private ShipmentStatus shippingStatus;
    private ParcelDimensions parcelDimensions;
    private Double weight;
    private Money price;
    private Instant createdAt;
    private Instant updatedAt;
    private UUID currentHubId;
    private UUID assignedCourierId;
    private String notes;

}
