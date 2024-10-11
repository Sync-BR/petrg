package com.meuspets.petlove.controller;

import com.meuspets.petlove.handling.UsuarioHanding;
import com.meuspets.petlove.model.UsuarioModel;
import com.meuspets.petlove.repository.UsuarioRepository;
import com.meuspets.petlove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController extends UserService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> registerUser(@RequestBody UsuarioModel user) throws UsuarioHanding {
        if(!checkNullUser(user)){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
