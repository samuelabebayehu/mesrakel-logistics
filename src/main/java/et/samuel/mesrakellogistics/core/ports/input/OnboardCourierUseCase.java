package et.samuel.mesrakellogistics.core.ports.input;

import et.samuel.mesrakellogistics.core.domain.Courier;

public interface OnboardCourierUseCase {

    Courier onboardCourier(Courier courier);
}
