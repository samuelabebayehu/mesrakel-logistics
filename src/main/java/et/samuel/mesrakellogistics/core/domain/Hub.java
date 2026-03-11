package et.samuel.mesrakellogistics.core.domain;

import et.samuel.mesrakellogistics.core.domain.vo.Address;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hub {
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    private Address hubAddress;
    private String description;
    private Integer capacity;
    @Singular("activeShipmentId")
    private List<String> activeShipmentIds;
}
