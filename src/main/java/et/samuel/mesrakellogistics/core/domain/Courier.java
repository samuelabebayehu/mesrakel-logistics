package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.CourierStatus;
import et.samuel.mesrakellogistics.core.domain.vo.VehicleType;
import et.samuel.mesrakellogistics.core.exception.InvalidCourierStatus;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courier {
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    private String phoneNumber;
    private VehicleType vehicleType;
    private CourierStatus courierStatus;
    private Double currentLatitude;
    private Double currentLongitude;
    private Double maxWeightCapacity;
    private Instant createdAt;
    private Instant updatedAt;

    public void markAsOnDuty(){
        if(courierStatus != CourierStatus.AVAILABLE){
            throw new InvalidCourierStatus("Courier status "+ this.getCourierStatus() + " invalid for courier Id "+this.getId());
        }
        this.courierStatus = CourierStatus.ON_DELIVERY;
        this.updatedAt = Instant.now();

    }
    public void completeDelivery(){
        if(courierStatus != CourierStatus.ON_DELIVERY){
            throw new InvalidCourierStatus("Courier status "+ this.getCourierStatus() + " invalid for courier Id "+this.getId());
        }
        this.courierStatus = CourierStatus.AVAILABLE;
        this.updatedAt = Instant.now();

    }

    public void initialize(){
        this.id = UUID.randomUUID();
        this.courierStatus = CourierStatus.AVAILABLE;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public void updateLocation(Double latitude, Double longitude){
        if(this.courierStatus == CourierStatus.ON_DELIVERY || this.courierStatus == CourierStatus.AVAILABLE){
            this.currentLatitude = latitude;
            this.currentLongitude = longitude;
        }
    }
}
