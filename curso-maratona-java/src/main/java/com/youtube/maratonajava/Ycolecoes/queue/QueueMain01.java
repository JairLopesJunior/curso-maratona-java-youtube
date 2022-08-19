package com.youtube.maratonajava.Ycolecoes.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain01 {

    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        fila.forEach(System.out::println);
        System.out.println();

        while (!fila.isEmpty()) {
            System.out.println(fila.peek()); // Retorna o primeiro elemento da fila
        }

    }
}
