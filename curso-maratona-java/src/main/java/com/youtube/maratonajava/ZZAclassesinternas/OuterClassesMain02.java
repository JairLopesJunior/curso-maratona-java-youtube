package com.youtube.maratonajava.ZZAclassesinternas;

public class OuterClassesMain02 {

    private String name = "Midoriya";

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesMain02 outer = new OuterClassesMain02();
        outer.print();
    }
}
