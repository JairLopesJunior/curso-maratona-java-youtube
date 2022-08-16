package com.youtube.maratonajava.Ycolecoes.list.sort;

import com.youtube.maratonajava.Ycolecoes.dominio.Manga;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MangaSortMain01 {

    public static void main(String[] args) {

        List<Manga> mangas = Arrays.asList(
                new Manga(5L, "Hellsing Ultimate", 19.9),
                new Manga(1L, "Berserk", 9.5),
                new Manga(4L, "Pokemon", 3.2),
                new Manga(3L, "Atack on titan", 11.20),
                new Manga(2L, "Dragon ball Z", 2.99)
        );

        mangas.forEach(System.out::println);

        Collections.sort(mangas);

        mangas.forEach(System.out::println);
    }
}
