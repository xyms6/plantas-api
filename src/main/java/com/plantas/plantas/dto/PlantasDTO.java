package com.plantas.plantas.dto;

import com.plantas.plantas.model.Plantas;

public class PlantasDTO {

    private String nome;
    private String especie;
    private String imagem;
    private String descricao;

    public PlantasDTO() {
    }

    public PlantasDTO(Plantas plantas) {
        nome = plantas.getNome();
        especie = plantas.getEspecie();
        imagem = plantas.getImagem();
        descricao = plantas.getDescricao();
    }

    public PlantasDTO(String nome, String especie, String imagem, String descricao) {
        this.nome = nome;
        this.especie = especie;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {   
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
