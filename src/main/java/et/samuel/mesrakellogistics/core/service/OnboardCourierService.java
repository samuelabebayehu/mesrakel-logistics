package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Courier;
import et.samuel.mesrakellogistics.core.ports.input.OnboardCourierUseCase;
import et.samuel.mesrakellogistics.core.ports.output.CourierRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OnboardCourierService implements OnboardCourierUseCase {
    private final CourierRepositoryPort courierRepositoryPort;

    @Override
    public Courier onboardCourier(Courier courier) {
        courier.initialize();
        return courierRepositoryPort.save(courier);
    }
}
