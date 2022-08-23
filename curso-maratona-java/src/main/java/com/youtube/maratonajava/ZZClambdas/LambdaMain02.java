package com.youtube.maratonajava.ZZClambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaMain02 {

    public static void main(String[] args) {

        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> map = map(strings, s -> s.length());
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for(T t: list) {
            R apply = function.apply(t);
            result.add(apply);
        }
        return result;
    }
}
