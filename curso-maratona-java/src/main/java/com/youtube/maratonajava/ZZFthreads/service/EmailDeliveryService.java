package com.youtube.maratonajava.ZZFthreads.service;

import com.youtube.maratonajava.ZZFthreads.dominio.Membros;

public class EmailDeliveryService implements Runnable {

    private final Membros membros;

    public EmailDeliveryService(Membros membros) {
        this.membros = membros;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name + " starting to deliver emails...");
        while (membros.isOpen() || membros.pendingEmails() > 0) {
            try {
                String email = membros.retrieveEmail();
                if(email == null) continue;
                System.out.println(name + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(name + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Todos os emails foram enviados com sucesso");
        }
    }
}
