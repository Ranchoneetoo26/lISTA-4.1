package com.example;

public class Main {
    public static void main(String[] args) {
        Senha senha1 = new Senha("Teste@123");
        System.out.println("A senha contém caractere especial? " + senha1.contemCaractereEspecial());
        
        Senha senha2 = new Senha("Teste123");
        System.out.println("A senha contém caractere especial? " + senha2.contemCaractereEspecial());
    }
}