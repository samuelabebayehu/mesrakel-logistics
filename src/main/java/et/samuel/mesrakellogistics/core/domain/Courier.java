package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.CourierStatus;
import et.samuel.mesrakellogistics.core.domain.vo.VehicleType;
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

}
