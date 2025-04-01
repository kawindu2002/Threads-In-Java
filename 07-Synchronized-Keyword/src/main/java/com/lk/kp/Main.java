package com.lk.kp;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            System.out.println("T1");
            increment(1000);

        });

        Thread t2 = new Thread(()-> {
            System.out.println("T2");
            increment(1000);

        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

    public static void increment(int y){
        for (int i = 0; i < y ; i++) {
            System.out.println(i+1);
        }
    }
}

