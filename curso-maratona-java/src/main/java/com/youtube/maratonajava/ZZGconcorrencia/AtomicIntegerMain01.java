package com.youtube.maratonajava.ZZGconcorrencia;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    void increment() {
        this.count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerMain01 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        };
        long inicio = System.currentTimeMillis();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para as duas Threads " + (fim - inicio) + "ms");

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
