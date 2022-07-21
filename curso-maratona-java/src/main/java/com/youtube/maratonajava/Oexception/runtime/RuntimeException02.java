package com.youtube.maratonajava.Oexception.runtime;

public class RuntimeException02 {

    public static void main(String[] args) {
        divisao(1, 0);
    }

    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}



















