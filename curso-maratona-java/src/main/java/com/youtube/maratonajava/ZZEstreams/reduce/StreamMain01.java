package com.youtube.maratonajava.ZZEstreams.reduce;

import java.util.List;
import java.util.Optional;

public class StreamMain01 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println); // Tráz a soma de toda a lista (Optional)

        Integer reduce = integers.stream()
                .reduce(0, (x, y) -> x + y); // Retorna o valor inteiro da soma da lista
        System.out.println(reduce);

        Integer reduce1 = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce1);

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        Integer reduce2 = integers.stream()
                .reduce(1, (x, y) -> x * y);
        System.out.println(reduce2);

        integers.stream()
                .reduce((x, y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        Integer reduce3 = integers.stream()
                .reduce(0, Integer::max);
        System.out.println(reduce3);
    }
}
