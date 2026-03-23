package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;
import et.samuel.mesrakellogistics.core.domain.vo.ShipmentStatus;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
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

    public void validateForPricing(){
        if(parcelDimensions == null){
            throw new IllegalStateException("ParcelDimensions cannot be null");
        }
        if(weight == null){
            throw new IllegalStateException("Weight cannot be null");
        }
    }

    public void initialize(){
        this.id = UUID.randomUUID();
        this.trackingNumber = "TRK"+UUID.randomUUID().toString().substring(0,8).toLowerCase();
        this.shippingStatus = ShipmentStatus.PENDING;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public void assignToCourier(Courier courier){
        this.assignedCourierId = courier.getId();
        this.shippingStatus = ShipmentStatus.ASSIGNED;
        this.updatedAt = Instant.now();
    }

    public void applyPricing(Money money){
        this.price = money;
    }
}
