package et.samuel.mesrakellogistics.core.domain.vo;

import lombok.Value;


@Value
public class ParcelDimensions {
    Double length;
    Double width;
    Double height;
    String unit;

    public ParcelDimensions(Double length, Double width, Double height, String unit) {
        if(length == null || width == null || height == null || unit.isBlank()) {
            throw new IllegalArgumentException("Length and width and height must be non-blank");
        }
        if(length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Length and width and height must be greater than zero");
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.unit = unit;
    }

    public Double volume() {
        return length * width * height;
    }
}
