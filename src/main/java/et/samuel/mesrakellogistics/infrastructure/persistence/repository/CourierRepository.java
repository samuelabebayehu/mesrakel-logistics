package et.samuel.mesrakellogistics.infrastructure.persistence.repository;

import et.samuel.mesrakellogistics.infrastructure.persistence.document.CourierDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CourierRepository extends MongoRepository<CourierDocument, UUID> {
}
