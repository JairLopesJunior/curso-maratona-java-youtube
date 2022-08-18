package com.youtube.maratonajava.Ycolecoes.map;

import com.youtube.maratonajava.Ycolecoes.dominio.Consumidor;
import com.youtube.maratonajava.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain03 {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Jair");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        System.out.println(consumidor1);

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Atack on titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for(Map.Entry<Consumidor, Manga> entry: consumidorManga.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();

        consumidorListMap.put(consumidor1, mangaConsumidor1List);
        consumidorListMap.put(consumidor2, mangaConsumidor2List);

        for(Map.Entry<?, ?> entry: consumidorListMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
