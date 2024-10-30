package com.meuspets.petlove.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping(value = "/api/fileController", consumes = "multipart/form-data")
@RestController
public class FileUploadController {
    private static final String dir = "E:/Java/Projetos SpringBoot/petrg/img/";
    @PostMapping(value = "/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            File directory = new File(dir);
            if(!directory.exists()){
                boolean dirCreated = directory.mkdir();
                System.out.println("Diretório criado: " + dirCreated);
            }
            File destinationFile = new File(dir + file.getOriginalFilename());
            file.transferTo(destinationFile);
            return ResponseEntity.ok("Imagem enviada com sucesso!");
        } catch (IOException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Falha no upload da imagem.");

        }
    }
}
