package et.samuel.mesrakellogistics.core.domain.vo;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class ParcelDimensions {
    Double length;
    Double width;
    Double height;
    String unit;

    public Double volume() {
        return length * width * height;
    }
}
