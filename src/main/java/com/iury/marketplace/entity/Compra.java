package com.iury.marketplace.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private Long quantidade;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "carrinho_estoque",
        joinColumns = {
            @JoinColumn(name = "id_carrinho") 
        }, 
        inverseJoinColumns = {
            @JoinColumn(name = "id_estoque")
        }
        )
    private List<Estoque> estoques;

    private String situacao;

    private LocalDate dataFinalizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comprador_id", nullable = false)
    private Usuario usuario;

    public Compra() {
    }

    public Compra(Long id, Long quantidade, List<Estoque> estoques, String situacao, LocalDate dataFinalizacao, Usuario usuario) {
        this.id = id;
        this.quantidade = quantidade;
        this.estoques = estoques;
        this.situacao = situacao;
        this.dataFinalizacao = dataFinalizacao;
        this.usuario = usuario;
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

    public List<Estoque> getEstoques() {
        return this.estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataFinalizacao() {
        return this.dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDate dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
