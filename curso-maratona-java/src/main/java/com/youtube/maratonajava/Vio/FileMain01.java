package com.youtube.maratonajava.Vio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class FileMain01 {

    public static void main(String[] args) {

        File file = new File("file.txt");
        try {
            //boolean isDeleted = file.delete();
            //boolean isCreated = file.createNewFile();
            //boolean exists = file.exists();
            System.out.println("Path: " + file.getPath());
            System.out.println("Path Absolute " + file.getAbsolutePath());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is File " + file.isFile());
            System.out.println("Is Hidden " + file.isHidden());
            System.out.println("Last Modified " + Instant.ofEpochMilli(file.lastModified()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


















