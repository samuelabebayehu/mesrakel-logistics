package et.samuel.mesrakellogistics.presentation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ParcelDimensionsDto(@NotNull(message = "Length is required") @Min(value = 0, message = "Length must be positive") Double length,
                                  @NotNull(message = "Width is required") @Min(value = 0, message = "Width must be positive") Double width,
                                  @NotNull(message = "Height is required") @Min(value = 0, message = "Height must be positive") Double height,
                                  @NotBlank(message = "Unit is required") String unit) {

}
