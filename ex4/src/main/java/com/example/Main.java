package com.example;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("joao@gmail.com", "maria@gmail.com", "ola maria, tudo bem?:");
        System.out.println("Numero de palavras na mensagem: " + email.contarPalavras());
    }
}