package com.youtube.maratonajava.Oexception.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {

    public static void main(String[] args) {
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {}
}
