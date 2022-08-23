package com.youtube.maratonajava.ZZBcomportamento.interfaces;

import com.youtube.maratonajava.ZZBcomportamento.dominio.Car;

public interface CarPredicate<E> {

    boolean test(E car);
}
