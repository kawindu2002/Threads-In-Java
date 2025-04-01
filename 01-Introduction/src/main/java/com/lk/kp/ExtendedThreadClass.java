package com.lk.kp;

public class ExtendedThreadClass {
    public static void main(String[] args) {
        // Create a Thread Object
        MyThread myThread = new MyThread();
        // Start the Thread Object
        myThread.start();
    }
}

// We extend MyThread class using Thread class
class MyThread extends Thread {

    @Override
    // Overrided run method of Thread class
    public void run() {
        System.out.println("My new Thread");
    }
}

