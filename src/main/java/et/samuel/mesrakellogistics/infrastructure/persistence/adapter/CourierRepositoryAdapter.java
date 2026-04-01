package et.samuel.mesrakellogistics.infrastructure.persistence.adapter;

import et.samuel.mesrakellogistics.core.domain.Courier;
import et.samuel.mesrakellogistics.core.ports.output.CourierRepositoryPort;
import et.samuel.mesrakellogistics.infrastructure.persistence.document.CourierDocument;
import et.samuel.mesrakellogistics.infrastructure.persistence.mapper.CourierPersistenceMapper;
import et.samuel.mesrakellogistics.infrastructure.persistence.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class CourierRepositoryAdapter implements CourierRepositoryPort {
    private final CourierRepository courierRepository;
    private final CourierPersistenceMapper courierPersistenceMapper;

    @Override
    public Courier create(Courier courier) {
        CourierDocument courierDocument = courierPersistenceMapper.toDocument(courier);
        courierRepository.save(courierDocument);
        return courierPersistenceMapper.toDomain(courierDocument);
    }

    @Override
    public Optional<Courier> find(String courierId) {
        return courierRepository.findById(UUID.fromString(courierId)).map(courierPersistenceMapper::toDomain);
    }

    @Override
    public void delete(Courier courier) {
        CourierDocument courierDocument = courierPersistenceMapper.toDocument(courier);
        courierRepository.delete(courierDocument);
    }
}
