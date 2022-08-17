package com.youtube.maratonajava.Ycolecoes.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoMain01 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println();

        List<Integer> arrayToList = Arrays.asList(listToArray);
        arrayToList.set(0 , 12);
        //arrayToList.add(16);
        arrayToList.forEach(System.out::println);
        System.out.println(Arrays.toString(listToArray));
        System.out.println();

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(listToArray));
        numerosList.add(111);
        System.out.println(numerosList);
        System.out.println(Arrays.toString(listToArray));
    }
}
