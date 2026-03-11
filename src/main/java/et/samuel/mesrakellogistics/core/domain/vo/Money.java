package et.samuel.mesrakellogistics.core.domain.vo;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Money {
    BigDecimal amount;
    String currency;

    public Money plus(Money other) {
        return new Money(amount.add(other.amount), currency);
    };
    public boolean isGreaterThan(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
    public static Money zero(String currency) {
        return new Money(BigDecimal.ZERO, currency);
    }
}
