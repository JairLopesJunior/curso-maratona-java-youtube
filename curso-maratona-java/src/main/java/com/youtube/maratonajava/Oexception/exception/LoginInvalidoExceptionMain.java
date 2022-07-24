package com.youtube.maratonajava.Oexception.exception;

import com.youtube.maratonajava.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionMain {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);
        String username = "Goku";
        String password = "ssj";
        System.out.println("Usuário:");
        String usernameDigitado = scan.nextLine();
        System.out.println("Senha:");
        String passwordDigitada = scan.nextLine();

        if(!username.equals(usernameDigitado) || !password.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
