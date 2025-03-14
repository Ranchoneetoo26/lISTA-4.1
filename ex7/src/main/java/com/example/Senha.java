package com.example;
import java.util.regex.*;

public class Senha {
    private String valor;

    public Senha(String valor) {
        this.valor = valor;
    }

    public boolean contemCaractereEspecial() {
        // Define um padrão que verifica se há pelo menos um caractere especial
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+\-=\\[\\]{};':\\\",.<>?/|]");
        Matcher matcher = pattern.matcher(valor);
        return matcher.find();
    }
}
