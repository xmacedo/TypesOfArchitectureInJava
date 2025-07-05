package br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.ports.in;

import java.math.BigDecimal;

public interface TransferService {
    void transfer(String fromId, String toId, BigDecimal amount);
}
