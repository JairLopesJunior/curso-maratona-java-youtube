package com.youtube.maratonajava.ZZFthreads.threadsafe;

import com.youtube.maratonajava.ZZFthreads.dominio.Membros;
import com.youtube.maratonajava.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryMain01 {

    public static void main(String[] args) {

        Membros membros = new Membros();
        Thread jiraya = new Thread(new EmailDeliveryService(membros), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(membros), "Kakashi");
        jiraya.start();
        kakashi.start();

        for(;;) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()) {
                membros.close();
                break;
            }
            membros.addMembreEmail(email);
        }
    }
}
