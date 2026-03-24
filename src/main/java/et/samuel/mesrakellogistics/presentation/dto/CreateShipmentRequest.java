package et.samuel.mesrakellogistics.presentation.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateShipmentRequest(@NotBlank(message = "Sender name is required") String senderName,
                                    @NotBlank(message = "Recipient name is required") String recipientName,
                                    @NotBlank(message = "Contact phone is required") String contactPhone,
                                    @NotNull(message = "Shipping origin is required") @Valid AddressDto shippingOrigin,
                                    @NotNull(message = "Shipping destination is required") @Valid AddressDto shippingDestination,
                                    @NotNull(message = "Parcel dimensions are required") @Valid ParcelDimensionsDto parcelDimensions,
                                    @NotNull(message = "Weight is required") @Min(value = 0, message = "Weight must be positive") Double weight,
                                    String notes) {}
