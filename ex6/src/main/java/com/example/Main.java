package com.example;

public class Main {
    // Método principal para teste
    public static void main(String[] args) {
        CPF cpf = new CPF("12345678909");
        System.out.println("CPF formatado: " + cpf.formatarCPF()); // 123.456.789-09
    }
}