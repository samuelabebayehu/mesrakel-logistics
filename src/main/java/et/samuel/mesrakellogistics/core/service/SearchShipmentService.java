package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.input.SearchShipmentsUseCase;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class SearchShipmentService implements SearchShipmentsUseCase {

    private final ShipmentRepositoryPort shipmentRepository;

    @Override
    public Shipment searchShipment(String id) {
        return shipmentRepository.find(id);
    }
}
