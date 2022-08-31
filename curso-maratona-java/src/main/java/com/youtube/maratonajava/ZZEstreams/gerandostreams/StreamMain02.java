package com.youtube.maratonajava.ZZEstreams.gerandostreams;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamMain02 {

    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // 0 1
        // (0, 1) (1, 1) (1, 2) (2, 3) (3, 5) (5, 8)
        Stream.iterate(new int[]{0, 1}, n -> new int[]{ n[1], n[0] + n[1] })
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a)));
        System.out.println();

        Stream.iterate(new int[]{0, 1}, n -> new int[]{ n[1], n[0] + n[1] })
                .limit(10)
                .map(l -> l[0])
                .forEach(System.out::print);
        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(10)
                .forEach(System.out::print);
    }
}
