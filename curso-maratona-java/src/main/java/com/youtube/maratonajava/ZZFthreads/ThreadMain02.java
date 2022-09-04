package com.youtube.maratonajava.ZZFthreads;

// Outra forma de criar Thread
class ThreadExampleRunnable2 implements Runnable {

    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.print(this.c);
            if(i % 3 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadMain02 {

    public static void main(String[] args) throws InterruptedException {

        // Uma forma de criar Thread
        //new Thread(() -> {}).start();

        // Uma forma de criar Thread
        //Runnable runnable = () -> {};

        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"), "T1");
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"), "T2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
    }
}
