package com.youtube.maratonajava.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMain01 {

    public static void main(String[] args) {

        List<String> lista = List.of("William", "Suane", "Luffy", "Zoro");
        forEach(lista, s -> System.out.println(s));
    }

    private static <T> void forEach(List<T> lista, Consumer<T> consumer) {
        for(T e: lista) {
            consumer.accept(e);
        }
    }
}
