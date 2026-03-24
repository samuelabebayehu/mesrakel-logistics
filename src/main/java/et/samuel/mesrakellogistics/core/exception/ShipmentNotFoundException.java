package et.samuel.mesrakellogistics.core.exception;

import java.util.UUID;

public class ShipmentNotFoundException extends DomainException {
    public ShipmentNotFoundException(UUID id) {
        super(String.format("Shipment with ID %s not found", id));
    }
    public ShipmentNotFoundException(String id) {
        super(String.format("Shipment with ID %s not found", id));
    }
}
