package com.example;

public class PlacaVeiculo {
    private String codigoPlaca;

    // Construtor
    public PlacaVeiculo(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }

    // Método para validar se a placa segue o padrão "AAA-9999"
    public boolean validarPlaca() {
        return codigoPlaca != null && codigoPlaca.matches("[A-Z]{3}-\\d{4}");
    }

    // Getters e Setters
    public String getCodigoPlaca() {
        return codigoPlaca;
    }

    public void setCodigoPlaca(String codigoPlaca) {
        this.codigoPlaca = codigoPlaca;
    }
}