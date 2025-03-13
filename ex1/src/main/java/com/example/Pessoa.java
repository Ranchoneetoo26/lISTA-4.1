package com.example;

public class Pessoa {
    private String nome;
    private String sobrenome;

    //contrutor
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //metodo para obter o nome completo
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
