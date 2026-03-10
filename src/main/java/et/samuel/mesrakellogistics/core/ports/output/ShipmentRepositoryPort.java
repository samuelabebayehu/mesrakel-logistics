package et.samuel.mesrakellogistics.core.ports.output;

import et.samuel.mesrakellogistics.core.domain.Shipment;

public interface ShipmentRepositoryPort {
    Shipment create(Shipment shipment);

}
