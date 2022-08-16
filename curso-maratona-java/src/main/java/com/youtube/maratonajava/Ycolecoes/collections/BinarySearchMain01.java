package com.youtube.maratonajava.Ycolecoes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchMain01 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // Regra do Binary Search
        // (- (ponto de inserção) -1)
        // index 0, 1, 2, 3
        // value 0, 2, 3, 4

        Collections.sort(numeros);
        int resul = Collections.binarySearch(numeros, 8);
        System.out.println(resul);
    }
}
