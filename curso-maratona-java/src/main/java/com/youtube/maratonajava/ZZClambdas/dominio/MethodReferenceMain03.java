package com.youtube.maratonajava.ZZClambdas.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceMain03 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "Rimuru",
                "Veldora",
                "Hikimaru"
        ));

        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numString = Integer::parseInt;
        System.out.println(numString.apply("12"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Rimuru"));
    }
}

























