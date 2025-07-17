package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.application;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.Order;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.OrderProcessor;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.PaymentPort;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.ShippingPort;

public class DefaultOrderProcessor implements OrderProcessor {
    private final PaymentPort paymentPort;
    private final ShippingPort shippingPort;
    public DefaultOrderProcessor(PaymentPort paymentPort, ShippingPort shippingPort) {
        this.paymentPort = paymentPort;
        this.shippingPort = shippingPort;
    }
    @Override
    public void process(Order order) {
        paymentPort.charge(order);
        shippingPort.schedule(order);
    }
}
