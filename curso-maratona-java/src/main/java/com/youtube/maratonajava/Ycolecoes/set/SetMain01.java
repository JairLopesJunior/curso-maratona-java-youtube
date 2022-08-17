package com.youtube.maratonajava.Ycolecoes.set;

import com.youtube.maratonajava.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain01 {

    public static void main(String[] args) {

        Set<Manga> mangas = new HashSet<>();
        //Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Atack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));

        mangas.forEach(System.out::println);
    }
}
