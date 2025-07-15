package br.com.xmacedo.typesofarchitectureinjava.layered.controller;

import br.com.xmacedo.typesofarchitectureinjava.layered.service.UserService;
import br.com.xmacedo.typesofarchitectureinjava.layered.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public ResponseEntity<UserDTO> getUser(Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}

