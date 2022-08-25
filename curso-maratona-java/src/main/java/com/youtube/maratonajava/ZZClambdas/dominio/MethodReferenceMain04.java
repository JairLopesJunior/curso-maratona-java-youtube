package com.youtube.maratonajava.ZZClambdas.dominio;

import com.youtube.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceMain04 {

    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Beserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeões", 36));
    }
}


















