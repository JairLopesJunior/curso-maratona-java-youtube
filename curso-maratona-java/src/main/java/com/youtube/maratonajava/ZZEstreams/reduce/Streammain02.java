package com.youtube.maratonajava.ZZEstreams.reduce;

import com.youtube.maratonajava.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class Streammain02 {

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

        Double reduce = lightNovels.stream()
                .map(ln -> ln.getPrice())
                .filter(ln -> ln > 3)
                .reduce(0D, Double::sum);
        System.out.println(reduce);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum();
        System.out.println(sum);
    }
}
