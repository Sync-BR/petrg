package com.meuspets.petlove.controller;

import com.meuspets.petlove.model.PetModel;
import com.meuspets.petlove.repository.PetsRepository;
import enums.TypeAnimals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    @Autowired
    private PetsRepository petsRepository;
    @PostMapping("/creater")
    public ResponseEntity<HttpStatus> registerPet( @RequestBody PetModel petModel){
        if(petModel != null){
            petsRepository.save(petModel);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
