package com.lk.kp;

public class Main {
    public static void main(String[] args) {
//        Thread t1 = new Thread(
//            new Runnable() {
//                public void run() {
//                    System.out.println("Hello World");
//                }
//            }
//        );

        //Lambda Expression --> Mew dnn puluwn functional interfaces wlt

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });
        t1.start();

        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }

        t2.start();
    }
}

// Output
    //A
    //B
    //B
    //A
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

