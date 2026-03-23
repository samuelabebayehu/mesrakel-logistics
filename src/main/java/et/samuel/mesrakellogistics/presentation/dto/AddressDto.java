package et.samuel.mesrakellogistics.presentation.dto;

public record AddressDto(String street,
                         String city,
                         String state,
                         String zip,
                         String country) {
}
