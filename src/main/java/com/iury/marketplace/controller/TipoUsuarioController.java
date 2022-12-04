package com.iury.marketplace.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iury.marketplace.dto.TipoUsuarioDTO;
import com.iury.marketplace.repository.TipoUsuarioRepository;

@RestController
@RequestMapping("/tipo_usuario")
public class TipoUsuarioController {
    
    @Autowired
    private TipoUsuarioRepository tipoUsuarioRep;

    @GetMapping(path = "/all")
    public ResponseEntity<?> getAll(){
        
        return ResponseEntity.ok().body(this.tipoUsuarioRep.findAll());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<?> adicionarTipoUsuario(@Valid TipoUsuarioDTO tipoUsuario){
        try {
            
            return ResponseEntity.ok().body("");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
