package et.samuel.mesrakellogistics.core.service;

import et.samuel.mesrakellogistics.core.domain.vo.Money;
import et.samuel.mesrakellogistics.core.domain.vo.ParcelDimensions;

import java.math.BigDecimal;

public class PricingService {
    private static final BigDecimal VOLUME_RATE = new BigDecimal("0.05");
   private static final BigDecimal WEIGHT_RATE = new BigDecimal("0.10");


    public Money calculatePrice(ParcelDimensions dimensions, Double weight, String currency) {
        return (dimensions.volume()*0.05) + (weight * 0.10)
    }
}
