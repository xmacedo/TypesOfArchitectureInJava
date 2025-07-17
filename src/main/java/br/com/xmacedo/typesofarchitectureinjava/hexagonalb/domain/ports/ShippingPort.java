package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.Order;

public interface ShippingPort {
    void schedule(Order order);
}
