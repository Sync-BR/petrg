package com.meuspets.petlove.controller;

import com.meuspets.petlove.controller.service.RegistrationData;
import com.meuspets.petlove.handling.UsuarioHanding;
import com.meuspets.petlove.model.LoginModel;
import com.meuspets.petlove.model.UsuarioModel;
import com.meuspets.petlove.repository.LoginRepository;
import com.meuspets.petlove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController extends UserService {
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private RegistrationData registrationData;
    @GetMapping("/check/username/{username}")
    public ResponseEntity<Boolean> checkUserName(@PathVariable String username) {
        if (registrationData.validUserName(username)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }
    @GetMapping("/getUserById/{username}")
    public ResponseEntity<LoginModel> getUser(@PathVariable String username) {
        LoginModel loginModel = loginRepository.findByUsername(username);
        return new ResponseEntity<>(loginModel, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/authenticate")
    public ResponseEntity<HttpStatus> login(@RequestBody LoginModel login) throws UsuarioHanding {
        if (!check(login)) {
            LoginModel loginFound = loginRepository.findByUsername(login.getUsername());
            if(loginFound.getPassword().equals(login.getPassword())) {
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
