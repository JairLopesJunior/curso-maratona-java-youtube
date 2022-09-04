package com.youtube.maratonajava.ZZFthreads;

import com.youtube.maratonajava.ZZFthreads.dominio.Account;

public class ThreadAccountMain01 implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        ThreadAccountMain01 threadAccountMain01 = new ThreadAccountMain01();
        Thread t1 = new Thread(threadAccountMain01, "T1");
        Thread t2 = new Thread(threadAccountMain01, "T2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if(account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private void withdrawl(int amount) {
        if(account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta " +
                    account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " +
                    getThreadName() + " efetuado o saque " +
                    account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
