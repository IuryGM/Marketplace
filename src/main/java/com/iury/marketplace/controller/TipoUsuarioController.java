package com.iury.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iury.marketplace.repository.TipoUsuarioRepository;

@RestController
@RequestMapping("/tipo_usuario")
public class TipoUsuarioController {
    
    @Autowired
    private TipoUsuarioRepository tipoUsuarioRep;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(this.tipoUsuarioRep.findAll());
    }

}
