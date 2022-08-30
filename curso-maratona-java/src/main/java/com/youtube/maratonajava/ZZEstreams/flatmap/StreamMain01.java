package com.youtube.maratonajava.ZZEstreams.flatmap;

import java.util.ArrayList;
import java.util.List;

public class StreamMain01 {

    public static void main(String[] args) {

        List<List<String>> devDojo = new ArrayList<>();
        List<String> grafhicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devDojo.add(grafhicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for(List<String> people: devDojo) {
            for(String person: people) {
                System.out.println(person);
            }
        }

        System.out.println("=========");

        devDojo.stream()
                .flatMap(l -> l.stream())
                .forEach(System.out::println);
    }
}
