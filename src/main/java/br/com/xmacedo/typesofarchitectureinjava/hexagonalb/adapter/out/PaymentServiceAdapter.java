package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.adapter.out;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.Order;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.PaymentPort;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceAdapter implements PaymentPort {
    @Override
    public void charge(Order order) {
        // Integrate with Stripe or internal API
    }
}