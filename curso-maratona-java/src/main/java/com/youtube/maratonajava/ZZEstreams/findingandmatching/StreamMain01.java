package com.youtube.maratonajava.ZZEstreams.findingandmatching;

import com.youtube.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMain01 {

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

        boolean anyMatch = lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 8);
        System.out.println(anyMatch);

        boolean allMatch = lightNovels.stream()
                .allMatch(ln -> ln.getPrice() > 0);
        System.out.println(allMatch);


        boolean noneMatch = lightNovels.stream()
                .noneMatch(ln -> ln.getPrice() > 10);
        System.out.println(noneMatch);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}



















