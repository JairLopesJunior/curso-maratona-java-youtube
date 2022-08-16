package com.youtube.maratonajava.Ycolecoes.list.sort;

import com.youtube.maratonajava.Ycolecoes.dominio.Manga;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

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
        System.out.println();

        Collections.sort(mangas);
        mangas.forEach(System.out::println);
        System.out.println();

        Collections.sort(mangas, new MangaByIdComparator());
        mangas.forEach(System.out::println);
        System.out.println();

        Collections.sort(mangas, new MangaByIdComparator());
        mangas
                .stream()
                .sorted((a, b) -> a.getNome().compareTo(b.getNome()))
                .forEach(System.out::println);
    }
}
