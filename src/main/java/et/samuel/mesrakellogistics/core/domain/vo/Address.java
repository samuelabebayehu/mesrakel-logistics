package et.samuel.mesrakellogistics.core.domain.vo;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Address {
    String street;
    String city;
    String state;
    String zip;
    String country;
}
