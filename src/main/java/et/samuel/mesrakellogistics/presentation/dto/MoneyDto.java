package et.samuel.mesrakellogistics.presentation.dto;

import java.math.BigDecimal;

public record MoneyDto(BigDecimal amount,
                       String currency) {
}
