package com.youtube.maratonajava.ZZEstreams.groupingby;

import com.youtube.maratonajava.ZZEstreams.dominio.Category;
import com.youtube.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.counting()
                ));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))
                ));
        System.out.println(collect1);

        Map<Double, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getPrice,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(
                                        LightNovel::getPrice
                                )),
                                Optional::get
                        )
                ));
        System.out.println(collect2);
    }
}


















