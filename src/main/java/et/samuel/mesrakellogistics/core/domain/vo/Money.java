package et.samuel.mesrakellogistics.core.domain.vo;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Money {
    BigDecimal amount;
    String currency;


    public Money(BigDecimal amount, String currency) {
        if(amount == null || currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Amount and currency are required");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public Money plus(Money other) {
        if(!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Currency does not match");
        }
        return new Money(amount.add(other.amount), currency);
    };

    public Money minus(Money other) {
        if(!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Currency does not match");
        }
        if (isGreaterThan(other)) {
            return new Money(amount.subtract(other.amount), currency);
        }
        else return Money.zero(currency);
    };
    public boolean isGreaterThan(Money other) {
        return amount.compareTo(other.amount) > 0;
    }
    public static Money zero(String currency) {
        return new Money(BigDecimal.ZERO, currency);
    }
}
