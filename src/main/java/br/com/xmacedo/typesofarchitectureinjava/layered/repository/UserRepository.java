package br.com.xmacedo.typesofarchitectureinjava.layered.repository;

import br.com.xmacedo.typesofarchitectureinjava.layered.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
