package com.example;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
        System.out.println("Título em maiúsculas: " + livro.getTituloMaiusculo());
    }
}