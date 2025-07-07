package br.com.xmacedo.typesofarchitectureinjava.hexagonal.adapters.in.web;

import br.com.xmacedo.typesofarchitectureinjava.hexagonal.adapters.in.web.model.TransferRequest;
import br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.ports.in.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/transfer")
public class TransferController {

    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping
    public ResponseEntity<Void> transfer(@RequestBody TransferRequest request) {
        transferService.transfer(request.getFromId(), request.getToId(), request.getAmount());
        return ResponseEntity.ok().build();
    }
}
