package com.example;

public class CPF {
    private String numeroCPF;

    // Construtor
    public CPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    // Método para formatar o CPF no padrão "XXX.XXX.XXX-XX"
    public String formatarCPF() {
        if (numeroCPF != null && numeroCPF.matches("\\d{11}")) {
            return numeroCPF.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        }
        return "CPF inválido";
    }

    // Getters e Setters
    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }
}
