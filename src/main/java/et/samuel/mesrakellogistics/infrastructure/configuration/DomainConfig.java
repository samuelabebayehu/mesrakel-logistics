package et.samuel.mesrakellogistics.infrastructure.configuration;

import et.samuel.mesrakellogistics.core.ports.input.AcceptShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.input.CreateShipmentUseCase;
import et.samuel.mesrakellogistics.core.ports.input.SearchShipmentsUseCase;
import et.samuel.mesrakellogistics.core.ports.output.CourierRepositoryPort;
import et.samuel.mesrakellogistics.core.ports.output.ShipmentRepositoryPort;
import et.samuel.mesrakellogistics.core.service.AcceptShipmentService;
import et.samuel.mesrakellogistics.core.service.CreateShipmentService;
import et.samuel.mesrakellogistics.core.service.PricingService;
import et.samuel.mesrakellogistics.core.service.SearchShipmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public CreateShipmentUseCase createShipmentUseCase(
            ShipmentRepositoryPort shipmentRepositoryPort,
            PricingService pricingService
    ){
        return new CreateShipmentService(shipmentRepositoryPort,pricingService);
    }

    @Bean
    public PricingService pricingService(){
        return new PricingService();
    }

    @Bean
    public SearchShipmentsUseCase searchShipmentsUseCase(ShipmentRepositoryPort shipmentRepositoryPort){
        return new SearchShipmentService(shipmentRepositoryPort);
    }

    @Bean
    public AcceptShipmentUseCase acceptShipmentUseCase(ShipmentRepositoryPort shipmentRepositoryPort, CourierRepositoryPort courierRepositoryPort){
        return new AcceptShipmentService(shipmentRepositoryPort,courierRepositoryPort);
    }
}
