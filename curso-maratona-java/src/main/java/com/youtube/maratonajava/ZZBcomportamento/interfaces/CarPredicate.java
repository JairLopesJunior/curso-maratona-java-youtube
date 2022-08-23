package com.youtube.maratonajava.ZZBcomportamento.interfaces;

@FunctionalInterface
public interface CarPredicate<E> {

    boolean test(E car);
}
