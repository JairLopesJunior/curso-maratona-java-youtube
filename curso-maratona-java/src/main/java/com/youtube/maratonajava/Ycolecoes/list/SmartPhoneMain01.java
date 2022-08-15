package com.youtube.maratonajava.Ycolecoes.list;

import com.youtube.maratonajava.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneMain01 {

    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "IPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        //smartphones.clear();

        smartphones.forEach(System.out::println);

        Smartphone s4 = new Smartphone("22222", "Pixel");

        boolean contains = smartphones.contains(s4);
        System.out.println(contains);

        int i = smartphones.indexOf(s4);
        System.out.println(i);
    }
}



























