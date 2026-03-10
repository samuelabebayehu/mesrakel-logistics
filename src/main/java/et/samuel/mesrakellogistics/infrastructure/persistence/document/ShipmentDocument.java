package et.samuel.mesrakellogistics.infrastructure.persistence.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "reviews")
public class ShipmentDocument {
}
