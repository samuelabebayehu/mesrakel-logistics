package et.samuel.mesrakellogistics.infrastructure.persistence.document;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;
import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@Document(collection = "shipments")
public class ShipmentDocument {
    @Id
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
