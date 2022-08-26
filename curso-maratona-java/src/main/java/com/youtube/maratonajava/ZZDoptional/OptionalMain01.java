package com.youtube.maratonajava.ZZDoptional;

import java.util.List;
import java.util.Optional;

public class OptionalMain01 {

    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        //Optional<Object> o2 = Optional.of(null); // Lança NullPointerException
        Optional<Object> o3 = Optional.ofNullable(null); // Retorna um Optional.empty
        Optional<Object> o4 = Optional.empty();// Retorna um Optional.empty

        System.out.println(o1.get());

        Optional<String> nameOptional = Optional.ofNullable(findName("Jair"));
        System.out.println(nameOptional); // Retorna Optional.empty

        String empty = nameOptional.orElse("EMPTY"); // Retorna a String EMPTY
        System.out.println(empty);

        Optional<String> nameOptional2 = Optional.ofNullable(findName("DevDojo"));
        nameOptional2.ifPresent(s -> System.out.println(s.toUpperCase())); // Se ter presente da um sout
    }

    private static String findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if(i != -1) {
            return list.get(i);
        }
        return null;
    }
}

























