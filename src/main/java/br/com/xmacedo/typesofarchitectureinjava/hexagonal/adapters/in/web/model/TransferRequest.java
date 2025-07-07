package br.com.xmacedo.typesofarchitectureinjava.hexagonal.adapters.in.web.model;

import java.math.BigDecimal;

public class TransferRequest {
    private String fromId;
    private String toId;
    private BigDecimal amount;

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
