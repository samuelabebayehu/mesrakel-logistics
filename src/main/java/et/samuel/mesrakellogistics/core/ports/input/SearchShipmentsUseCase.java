package et.samuel.mesrakellogistics.core.ports.input;

import et.samuel.mesrakellogistics.core.domain.Shipment;

import java.util.Optional;

public interface SearchShipmentsUseCase {
    Shipment searchShipment(String id);
}
