package br.com.xmacedo.typesofarchitectureinjava.hexagonal.application;

import br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.model.Account;
import br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.ports.in.TransferService;
import br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.ports.out.AccountRepository;
import java.math.BigDecimal;

public class TransferServiceImpl implements TransferService {
    private final AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void transfer(String fromId, String toId, BigDecimal amount) {
        Account accountFrom = accountRepository.findById(fromId).orElseThrow();
        Account accountTo = accountRepository.findById(toId).orElseThrow();
        accountFrom.transfer(accountTo, amount);
        accountRepository.save(accountFrom);
        accountRepository.save(accountTo);
    }
}
