package com.example;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("lapis", "amarelo");
        System.out.println("Nome do produto: " + produto.getDeterminadaPalavra());
    }
}