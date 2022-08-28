package com.youtube.maratonajava.ZZDoptional;

import com.youtube.maratonajava.ZZDoptional.dominio.Manga;
import com.youtube.maratonajava.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalMain02 {

    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
//         ou
//        Manga newManga = MangaRepository.findByTitle("Drifters")
//                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
