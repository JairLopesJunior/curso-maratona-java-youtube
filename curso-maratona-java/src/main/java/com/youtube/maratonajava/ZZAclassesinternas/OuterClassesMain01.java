package com.youtube.maratonajava.ZZAclassesinternas;

public class OuterClassesMain01 {

    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesMain01.this);
        }
    }

    public static void main(String[] args) {

        OuterClassesMain01 outerClass = new OuterClassesMain01();
        Inner inner1 = outerClass.new Inner();
        Inner inner2 = new OuterClassesMain01().new Inner();
        inner1.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
