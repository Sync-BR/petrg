package com.meuspets.petlove.controller.service;

import com.meuspets.petlove.model.LoginModel;
import com.meuspets.petlove.model.UsuarioModel;
import com.meuspets.petlove.repository.LoginRepository;
import com.meuspets.petlove.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/validar/")
@RestController
public class RegistrationData {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private LoginRepository loginRepository;
    public boolean validEmail(String email) {
        UsuarioModel existingUser = usuarioRepository.findByEmail(email);
        return existingUser != null;
    }
    public boolean validCpf(String cpf) {
        UsuarioModel existingUser = usuarioRepository.findByCpf(cpf);
        return existingUser != null;
    }
    public boolean validUserName(String username) {
        LoginModel existingUser = loginRepository.findByUsername(username);
        return existingUser != null;
    }
}
