package com.youtube.maratonajava.Oexception.error;

public class StackOverflowMain {

    public static void main(String[] args) {
        recusividade(); // Gera um StackOverflowError
    }

    public static void recusividade() {
        recusividade();
    }
}
