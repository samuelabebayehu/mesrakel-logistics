package et.samuel.mesrakellogistics.core.ports.input;

import et.samuel.mesrakellogistics.core.domain.Shipment;

public interface AcceptShipmentUseCase {
    Shipment acceptShipment(String shipmentId, String courierId);
}
