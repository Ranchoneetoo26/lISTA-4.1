package com.example;

public class Frase {
    private String texto;

    public Frase(String texto) {
        this.texto = texto;
    }

    public String inverterTexto() {
        return new StringBuilder(texto).reverse().toString();
    }
}
