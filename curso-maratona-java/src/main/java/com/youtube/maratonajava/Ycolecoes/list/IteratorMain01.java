package com.youtube.maratonajava.Ycolecoes.list;

import com.youtube.maratonajava.Ycolecoes.dominio.Manga;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain01 {

    public static void main(String[] args) {

        List<Manga> mangas = Arrays.asList(
                new Manga(5L, "Hellsing Ultimate", 19.9, 0),
                new Manga(1L, "Berserk", 9.5, 5),
                new Manga(4L, "Pokemon", 3.2, 0),
                new Manga(3L, "Atack on titan", 11.20, 2),
                new Manga(2L, "Dragon ball Z", 2.99, 0)
        );

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()) {
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        mangas.forEach(System.out::println);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
