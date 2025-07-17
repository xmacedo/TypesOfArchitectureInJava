package br.com.xmacedo.typesofarchitectureinjava.hexagonalb.config;

import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.adapter.out.PaymentServiceAdapter;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.adapter.out.ShippingServiceAdapter;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.application.DefaultOrderProcessor;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.OrderProcessor;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.PaymentPort;
import br.com.xmacedo.typesofarchitectureinjava.hexagonalb.domain.ports.ShippingPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderProcessorConfig {
    @Bean
    public OrderProcessor orderProcessor(PaymentPort paymentPort, ShippingPort shippingPort) {
        return new DefaultOrderProcessor(paymentPort, shippingPort);
    }

    @Bean
    public PaymentPort paymentPort() {
        return new PaymentServiceAdapter();
    }

    @Bean
    public ShippingPort shippingPort() {
        return new ShippingServiceAdapter();
    }
}
