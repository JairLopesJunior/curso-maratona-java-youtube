package com.youtube.maratonajava.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleMain01 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.containsKey("a"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println();

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "PT"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}


















