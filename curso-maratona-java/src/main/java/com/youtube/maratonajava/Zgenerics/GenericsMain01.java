package com.youtube.maratonajava.Zgenerics;

import com.youtube.maratonajava.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain01 {

    public static void main(String[] args) {

        // Conceito é chamado de:
        // Type erasure (Apagamento de tipo)
        List<String> lista =  new ArrayList<>(); // Generics em tempo de compilação
        lista.add("Midoriya");
        lista.add("Midoriya");
        add(lista, new Consumidor("Teste"));

        lista.forEach(System.out::println);
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
