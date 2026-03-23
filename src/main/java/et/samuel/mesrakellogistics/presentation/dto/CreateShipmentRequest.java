package et.samuel.mesrakellogistics.presentation.dto;

public record CreateShipmentRequest(String senderName,
                                    String recipientName,
                                    String contactPhone,
                                    AddressDto shippingOrigin,
                                    AddressDto shippingDestination,
                                    ParcelDimensionsDto parcelDimensions,
                                    Double weight,
                                    String notes) {}
