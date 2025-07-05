package br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.model;

import java.math.BigDecimal;

public class Account {
    private String id;
    private BigDecimal balance;

    public void transfer(Account target, BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.balance = this.balance.subtract(amount);
        target.balance = target.balance.add(amount);
    }
}
