package com.meuspets.petlove.controller;

import com.meuspets.petlove.controller.service.RegistrationData;
import com.meuspets.petlove.handling.UsuarioHanding;
import com.meuspets.petlove.model.LoginModel;
import com.meuspets.petlove.model.UsuarioModel;
import com.meuspets.petlove.repository.LoginRepository;
import com.meuspets.petlove.repository.UsuarioRepository;
import com.meuspets.petlove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController extends UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RegistrationData registrationData;

    @GetMapping("/check/email/{email}")
    public ResponseEntity<Boolean> checkEmail(@PathVariable String email) {
        if (registrationData.validEmail(email)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }
    @GetMapping("/check/cpf/{cpf}")
    public ResponseEntity<Boolean> checkCpf(@PathVariable String cpf) {
        if (registrationData.validCpf(cpf)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create/user")
    public ResponseEntity<HttpStatus> registerUser(@RequestBody UsuarioModel user) throws UsuarioHanding {
        LoginModel userLogin = new LoginModel(user);
        if (!check(userLogin)) {
            user.setLogin(userLogin);
            usuarioRepository.save(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
