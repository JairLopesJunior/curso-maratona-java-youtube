package com.youtube.maratonajava.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

    public static void main(String[] args) {

        // File - Trabalhar com o arquivo em si
        // FileWriter - Para escrever no arquivo mas não é otimizada
        // FileReader - Para leitura do arquivo mas não é otimizada
        // BufferedWriter - Escrita no arquivo mas com dados em memoria (Melhor Performance)
        // BufferedReader - Leitura do arquivo mas com dados em memoria (Melhor Performance)

        File file = new File("file.txt");
        try( FileWriter fw = new FileWriter(file) ){

            fw.write("O DevDojo é lindo, é o melhor curso do Brasillllll");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
