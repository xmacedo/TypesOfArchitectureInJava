package br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.ports.out;

import br.com.xmacedo.typesofarchitectureinjava.hexagonal.domain.model.Account;
import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(String id);
    void save(Account account);
}
