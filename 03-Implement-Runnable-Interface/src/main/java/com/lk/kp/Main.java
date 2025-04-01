package com.lk.kp;

public class Main {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);

        thread1.start();
        try {
            Thread.sleep(10);
        }catch (InterruptedException e) {
            throw new RuntimeException();
        }
        thread2.start();
    }
}

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}

// Output
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B
    //A
    //B

