package com.youtube.maratonajava.ZZEstreams.flatmap;

import java.util.Arrays;
import java.util.List;

public class StreamMain02 {

    public static void main(String[] args) {

        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .forEach(System.out::println);
    }
}
