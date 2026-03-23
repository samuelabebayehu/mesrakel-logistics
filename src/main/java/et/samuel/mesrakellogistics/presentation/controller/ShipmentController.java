package et.samuel.mesrakellogistics.presentation.controller;

import et.samuel.mesrakellogistics.core.domain.Shipment;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.presentation.dto.CreateShipmentRequest;
import et.samuel.mesrakellogistics.presentation.dto.ShipmentResponse;
import et.samuel.mesrakellogistics.presentation.mapper.ShipmentPresentationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/shipments")
@RequiredArgsConstructor
public class ShipmentController {

    private final CreateShipmentUseCase createShipmentUseCase;
    private final ShipmentPresentationMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ShipmentResponse createShipment(@RequestBody CreateShipmentRequest request) {
        Shipment shipment = mapper.toDomain(request);

        Shipment createdShipment = createShipmentUseCase.create(shipment);

        return mapper.toResponse(createdShipment)  ;
    }
}
