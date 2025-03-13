package com.example;

public class Main {
    // Método principal para teste
    public static void main(String[] args) {
        PlacaVeiculo placa1 = new PlacaVeiculo("ABC-1234");
        PlacaVeiculo placa2 = new PlacaVeiculo("A1B-2345");

        System.out.println("Placa 1 válida? " + placa1.validarPlaca()); // true
        System.out.println("Placa 2 válida? " + placa2.validarPlaca()); // false
    }
}