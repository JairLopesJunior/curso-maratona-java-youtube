package com.youtube.maratonajava.ZZBcomportamento;

import com.youtube.maratonajava.ZZBcomportamento.dominio.Car;
import com.youtube.maratonajava.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroMain02 {

    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("green", 2011),
                new Car("black", 1998),
                new Car("red", 2019));

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//        System.out.println(greenCars);

//        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
//        System.out.println(redCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car: cars) {
            if(carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static <T> List<T> filterGenerics(List<T> cars, CarPredicate carPredicate) {
        List<T> filterCar = new ArrayList<>();
        for (T car: cars) {
            if(carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
