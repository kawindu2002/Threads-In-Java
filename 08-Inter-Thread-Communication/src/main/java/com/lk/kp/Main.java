package com.lk.kp;

class Producer implements Runnable {
    A a;

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            a.put(i++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}


class Consumer implements Runnable { ///value ek get krn ken
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            a.get();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}


class A {
    int num;
    boolean flag = false;

    public synchronized void put(int num) {
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
        }

        System.out.println("Put: "+num);
        this.num = num;
        flag = true;
        notify();
    }

    public synchronized void get(){
        while(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get: "+num);
        flag = false;
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);

    }
}

//In this example, When producer thread put a value ,Consumer thread get it out.
//    Put: 0
//    Get: 0
//    Put: 1
//    Get: 1
//    Put: 2
//    Get: 2
//    Put: 3
//    Get: 3
//    Put: 4
//    Get: 4