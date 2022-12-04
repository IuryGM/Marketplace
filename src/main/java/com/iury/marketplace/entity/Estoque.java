package com.iury.marketplace.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Estoque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private Long quantidade;

    @Column(nullable = false)
    private Float valorUnidade;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "estoque_produto",
        joinColumns = {
            @JoinColumn(name = "id_estoque") 
        }, 
        inverseJoinColumns = {
            @JoinColumn(name = "id_produto")
        }
        )
    private List<Produto> produtos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "usuario_estoque", 
        joinColumns = {
            @JoinColumn(name = "id_estoque")    }, 
        inverseJoinColumns = {
            @JoinColumn(name = "id_usuario")    }
    )
    private List<Usuario> usuarios;

    public Estoque() {
    }

    public Estoque(Long id, Long quantidade, Float valorUnidade, List<Produto> produtos, List<Usuario> usuarios) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.produtos = produtos;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorUnidade() {
        return this.valorUnidade;
    }

    public void setValorUnidade(Float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
