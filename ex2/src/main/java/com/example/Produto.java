package com.example;

public class Produto {
    private String nome;
    private String descricao;

    //contrutor
    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    //metodo para obter determinada palavra
    public String getDeterminadaPalavra() {
        return nome + " " + descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao() {
        this.descricao = descricao;
    }
}
