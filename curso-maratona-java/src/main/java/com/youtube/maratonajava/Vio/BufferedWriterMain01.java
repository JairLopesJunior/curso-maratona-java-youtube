package com.youtube.maratonajava.Vio;

import java.io.*;

public class BufferedWriterMain01 {

    public static void main(String[] args) {

        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Dev Dojo é lindo");
            bw.write(System.lineSeparator());
            bw.write("Dev Dojo é lindo");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
