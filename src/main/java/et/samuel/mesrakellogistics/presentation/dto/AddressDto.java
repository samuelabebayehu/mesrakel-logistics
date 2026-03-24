package et.samuel.mesrakellogistics.presentation.dto;

import jakarta.validation.constraints.NotBlank;

public record AddressDto(@NotBlank(message = "Street is required") String street,
                         @NotBlank(message = "City is required") String city,
                         @NotBlank(message = "State is required") String state,
                         @NotBlank(message = "Zip code is required") String zip,
                         @NotBlank(message = "Country is required") String country) {
}
