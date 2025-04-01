package com.lk.kp;

public class Main {
    public static void main(String[] args) {
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

//        t1.setPriority(Thread.MAX_PRIORITY); //Max priority value is 10
//        t1.setPriority(Thread.NORM_PRIORITY); //Max priority value is 5
//        t1.setPriority(Thread.MIN_PRIORITY); //Max priority value is 1
//        Api mek denne priority ek thorgnn support ekk widiht withrai.. Aniwryen max priority ek mulinm execute wewi kiyl confirmation ekk nh.

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //Run wen thread ekk priority ek check krgnn mek use krnw
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread());

//      Thread wlt custom names denn mek use krnw
        t1.setName("Worker-1");
        t2.setName("Worker-2");

    }

}

