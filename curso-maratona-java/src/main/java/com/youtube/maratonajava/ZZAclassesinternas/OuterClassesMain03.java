package com.youtube.maratonajava.ZZAclassesinternas;

public class OuterClassesMain03 {

    private String name;

    static class Nested {
        void print() {
            System.out.println(new OuterClassesMain03().name);
        }
    }

    public static void main(String[] args) {

        Nested nested = new Nested();
        nested.print();
    }
}
