package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Courier;
import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.exception.CourierNotFoundException;
import et.samuel.mesrakellogistics.core.exception.ShipmentNotFoundException;
import et.samuel.mesrakellogistics.core.ports.input.AcceptShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.output.CourierRepositoryPort;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AcceptShipmentService implements AcceptShipmentUseCase {
    private final ShipmentRepositoryPort shipmentRepositoryPort;
    private final CourierRepositoryPort courierRepositoryPort;


    @Override
    public Shipment acceptShipment(String shipmentId, String courierId) {
        Shipment shipment = shipmentRepositoryPort.find(shipmentId)
                .orElseThrow(() -> new ShipmentNotFoundException("Shipment with ID " + shipmentId + " not found."));
        Courier courier = courierRepositoryPort.find(courierId)
                .orElseThrow(() -> new CourierNotFoundException("Courier with ID " + courierId + " not found."));

        shipment.assignToCourier(courier);
        courier.markAsOnDuty();
        shipmentRepositoryPort.create(shipment);
        courierRepositoryPort.save(courier);

        return shipment;
    }
}
