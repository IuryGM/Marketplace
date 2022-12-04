package com.iury.marketplace.dto;

public class TipoUsuarioDTO {
    private Long id;
    private String descricao;

    public TipoUsuarioDTO() {
    }

    public TipoUsuarioDTO(Long id, String descricao) {
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
