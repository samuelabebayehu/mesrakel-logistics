package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Courier;
import et.samuel.mesrakellogistics.core.exception.CourierNotFoundException;
import et.samuel.mesrakellogistics.core.ports.input.ManageCourierUseCase;
import et.samuel.mesrakellogistics.core.ports.output.CourierRepositoryPort;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ManageCourierService implements ManageCourierUseCase {
    private final CourierRepositoryPort courierRepositoryPort;

    @Override
    public Courier createCourier(Courier courier) {

        return courierRepositoryPort.create(courier);
    }

    @Override
    public void deleteCourier(String courierId) {
        Courier courier =  courierRepositoryPort.find(courierId).orElseThrow(()->new CourierNotFoundException("Courier with courier ID " + courierId + " Does not exist"));
        courierRepositoryPort.delete(courier);

    }

    @Override
    public Courier updateCourier(Courier courier) {
        return null;
    }

    @Override
    public Optional<Courier> findCourier(String id) {
        return Optional.empty();
    }
}
