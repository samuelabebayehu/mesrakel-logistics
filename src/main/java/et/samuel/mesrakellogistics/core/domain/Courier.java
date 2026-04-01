package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.CourierStatus;
import et.samuel.mesrakellogistics.core.domain.vo.VehicleType;
import et.samuel.mesrakellogistics.core.exception.InvalidCourierStatus;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
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

    public void markAsOnDuty(){
        if(courierStatus != CourierStatus.AVAILABLE){
            throw new InvalidCourierStatus("Courier status "+ this.getCourierStatus() + " invalid for courier Id "+this.getId());
        }
        this.courierStatus = CourierStatus.ON_DELIVERY;

    }
}
