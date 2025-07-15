package br.com.xmacedo.typesofarchitectureinjava.layered.service;

import br.com.xmacedo.typesofarchitectureinjava.layered.repository.UserRepository;
import br.com.xmacedo.typesofarchitectureinjava.layered.model.UserDTO;
import br.com.xmacedo.typesofarchitectureinjava.layered.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserDTO getUserById(Long id) {

        return UserMapper.toDTO(userRepository.findById(id).orElseThrow());
    }
}
