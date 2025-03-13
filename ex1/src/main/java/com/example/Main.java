package com.example;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Silva");
        System.out.println("Nome completo: " + pessoa.getNomeCompleto());
    }
}