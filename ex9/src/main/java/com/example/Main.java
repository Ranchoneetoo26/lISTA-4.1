package com.example;

public class Main {
    public static void main(String[] args) {
        URL url1 = new URL("https://www.exemplo.com");
        System.out.println("A URL começa com https:// ? " + url1.comecaComHttps());
        
        URL url2 = new URL("http://www.exemplo.com");
        System.out.println("A URL começa com https:// ? " + url2.comecaComHttps());
    }
}
