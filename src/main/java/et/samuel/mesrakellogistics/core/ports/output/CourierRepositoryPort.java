package et.samuel.mesrakellogistics.core.ports.output;

import et.samuel.mesrakellogistics.core.domain.Courier;

import java.util.Optional;

public interface CourierRepositoryPort {

    Courier create(Courier courier);

    Optional<Courier> find(String courierId);

    void delete(Courier courier);
}
