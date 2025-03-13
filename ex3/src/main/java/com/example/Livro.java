package com.example;

public class Livro {
    private String autor;
    private String titulo;

    //contrutor
    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    // Método para obter o título em letras maiúsculas
    public String getTituloMaiusculo() {
        return titulo.toUpperCase();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
