package com.example;

public class URL {
    private String endereco;

    public URL(String endereco) {
        this.endereco = endereco;
    }

    public boolean comecaComHttps() {
        return endereco.startsWith("https://");
    }
}