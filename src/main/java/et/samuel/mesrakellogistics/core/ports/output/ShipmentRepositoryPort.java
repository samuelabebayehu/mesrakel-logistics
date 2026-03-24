package et.samuel.mesrakellogistics.core.ports.output;

import et.samuel.mesrakellogistics.core.domain.Shipment;

import java.util.Optional;


public interface ShipmentRepositoryPort {
    Shipment create(Shipment shipment);

    Optional<Shipment> find(String id);
}
