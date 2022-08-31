package com.youtube.maratonajava.ZZEstreams.gerandostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain01 {

    public static void main(String[] args) {

        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print); // Não inclui o valor final
        System.out.println();

        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);
        System.out.println();

        Stream.of("Eleve", " O", " Cosmo", " no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int nums[] = {1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {

            lines
                    .filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
























