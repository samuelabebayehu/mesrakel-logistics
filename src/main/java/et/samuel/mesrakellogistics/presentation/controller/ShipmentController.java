package et.samuel.mesrakellogistics.presentation.controller;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.input.AcceptShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.input.SearchShipmentsUseCase;
import et.samuel.mesrakellogistics.core.exception.ShipmentNotFoundException;
import et.samuel.mesrakellogistics.presentation.dto.CreateShipmentRequest;
import et.samuel.mesrakellogistics.presentation.dto.ShipmentResponse;
import et.samuel.mesrakellogistics.presentation.mapper.ShipmentPresentationMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/shipments")
@RequiredArgsConstructor
public class ShipmentController {

    private final CreateShipmentUseCase createShipmentUseCase;
    private final SearchShipmentsUseCase searchShipmentsUseCase;
    private final AcceptShipmentUseCase acceptShipmentUseCase;
    private final ShipmentPresentationMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ShipmentResponse createShipment(@Valid @RequestBody CreateShipmentRequest request) {
        Shipment shipment = mapper.toDomain(request);

        Shipment createdShipment = createShipmentUseCase.create(shipment);

        return mapper.toResponse(createdShipment)  ;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ShipmentResponse findShipmentById(@PathVariable String id){
        return searchShipmentsUseCase.searchShipment(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new ShipmentNotFoundException(id));
    }

    @PostMapping("/assign/{shipmentId}/{courierId}")
    @ResponseStatus(HttpStatus.OK)
    public ShipmentResponse acceptShipment(@PathVariable String shipmentId,@PathVariable String courierId){
        return mapper.toResponse(acceptShipmentUseCase.acceptShipment(shipmentId,courierId));
    }
}
