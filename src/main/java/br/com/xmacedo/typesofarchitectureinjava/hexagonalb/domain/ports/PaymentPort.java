package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.Order;

public interface PaymentPort {
    void charge(Order order);
}
