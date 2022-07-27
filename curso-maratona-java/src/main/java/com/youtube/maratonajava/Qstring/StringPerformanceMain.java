package com.youtube.maratonajava.Qstring;

public class StringPerformanceMain {

    public static void main(String[] args) {
        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim2 - inicio2) + "ms");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(100_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim3 - inicio3) + "ms");

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer texto = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }
}
