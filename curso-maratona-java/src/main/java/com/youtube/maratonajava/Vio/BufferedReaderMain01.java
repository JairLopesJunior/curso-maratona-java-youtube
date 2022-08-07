package com.youtube.maratonajava.Vio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain01 {

    public static void main(String[] args) {

        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr)) {

            while (bf.ready()) {
                System.out.println(bf.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
