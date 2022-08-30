package com.youtube.maratonajava.ZZEstreams;

import com.youtube.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        lightNovels.stream().forEach(System.out::println); // Desperdiça processamento
        lightNovels.forEach(System.out::println); // Forma correta

        long count = lightNovels.stream()
                .filter(ln -> ln.getPrice() <= 4)
                .count(); // Contando o resultado

        System.out.println(count);

        long countDistinct = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count(); // Contando o resultado distinto

        System.out.println(countDistinct);
    }
}
