package com.senhasfortes.geradordesenhas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.senhasfortes.geradordesenhas.services.GeradorDeSenhasService;

@RestController
public class GeradorDeSenhasController {
    private final GeradorDeSenhasService geradorDeSenhasService;

    public GeradorDeSenhasController(GeradorDeSenhasService geradorDeSenhasService) {
        this.geradorDeSenhasService = geradorDeSenhasService;
    }

@GetMapping("senhaforte{var}")
      public ResponseEntity<Object> getSenha(@PathVariable int var){
        String senhagerada = geradorDeSenhasService.generateRandomPassword(var);
        return ResponseEntity.ok(senhagerada);
    }

}