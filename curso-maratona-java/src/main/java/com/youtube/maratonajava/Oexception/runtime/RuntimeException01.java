package com.youtube.maratonajava.Oexception.runtime;

public class RuntimeException01 {

    public static void main(String[] args) {
        // Checked e Unchecked
        Object object = null;
        System.out.println(object.toString()); // Gera um nullPointerException

        int[] nums = {1, 2};
        System.out.println(nums[2]); // Gera um ArrayIndexOutOfBoundsException
    }
}
