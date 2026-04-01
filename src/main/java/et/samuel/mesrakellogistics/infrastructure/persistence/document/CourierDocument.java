package et.samuel.mesrakellogistics.infrastructure.persistence.document;

import et.samuel.mesrakellogistics.core.domain.vo.CourierStatus;
import et.samuel.mesrakellogistics.core.domain.vo.VehicleType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.UUID;

@Data
@Builder
@Document(collection = "couriers")
public class CourierDocument {
    @Id
    private UUID id;
    private String name;
    private String phoneNumber;
    private VehicleType vehicleType;
    private CourierStatus courierStatus;
    private Double currentLatitude;
    private Double currentLongitude;
    private Double maxWeightCapacity;
}
