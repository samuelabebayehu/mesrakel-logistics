package et.samuel.mesrakellogistics.core.ports.input;

import et.samuel.mesrakellogistics.core.domain.Shipment;

public interface CreateShipmentUseCase {
    Shipment createShipment(Shipment shipment);
}
