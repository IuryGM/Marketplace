package com.iury.marketplace.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_id", nullable = false)
    private TipoProduto tipo;

    @ManyToMany(mappedBy = "produtos")
    private List<Estoque> estoques;

    public Produto() {
    }

    public Produto(Long id, String descricao, TipoProduto tipo, List<Estoque> estoques) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.estoques = estoques;
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

    public TipoProduto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public List<Estoque> getEstoques() {
        return this.estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

}
