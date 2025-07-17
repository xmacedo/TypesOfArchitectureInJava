package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.adapter.out;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.Order;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.ShippingPort;
import org.springframework.stereotype.Component;

@Component
public class ShippingServiceAdapter implements ShippingPort {
    @Override
    public void schedule(Order order) {
        // Call logistics API
    }
}
