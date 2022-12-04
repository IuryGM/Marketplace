package com.iury.marketplace.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "tipo")
    private List<Usuario> usuario;

    public TipoUsuario() {
    }

    public TipoUsuario(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
