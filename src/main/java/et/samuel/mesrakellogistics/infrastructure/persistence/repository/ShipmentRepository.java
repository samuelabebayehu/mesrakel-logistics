package et.samuel.mesrakellogistics.infrastructure.persistence.repository;

import et.samuel.mesrakellogistics.infrastructure.persistence.document.ShipmentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface ShipmentRepository extends MongoRepository<ShipmentDocument,String> {
}
