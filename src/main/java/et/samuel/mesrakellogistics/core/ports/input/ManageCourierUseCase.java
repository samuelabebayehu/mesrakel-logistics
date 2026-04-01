package et.samuel.mesrakellogistics.core.ports.input;

import et.samuel.mesrakellogistics.core.domain.Courier;

import java.util.Optional;

public interface ManageCourierUseCase {

    Courier createCourier(Courier courier);
    void deleteCourier(String courierId);
    Courier updateCourier(Courier courier);
    Optional<Courier> findCourier(String courierId);
}
