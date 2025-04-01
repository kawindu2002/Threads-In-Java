package com.lk.kp;

//public class Main {
//    public static void main(String[] args) {
//        A a = new A();
//        a.start();
//        B b = new B();
//        b.start();
//    }
//}
//
//class A extends Thread {
//    @Override
//    public void run() {
//       System.out.println("A");
//    }
//}
//
//class B extends Thread {
//    @Override
//    public void run() {
//        System.out.println("B");
//    }
//}
//
//// Output
//    //A
//    //B

// ===================================================================================================================


//public class Main {
//    public static void main(String[] args) {
//        A a = new A();
//        a.start();
//        B b = new B();
//        b.start();
//    }
//}
//
//class A extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("A");
//        }
//    }
//}
//
//class B extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("B");
//        }
//    }
//}

// Output
    //A
    //A
    //A
    //A
    //A
    //A
    //A
    //A
    //A
    //A
    //B
    //B
    //B
    //B
    //B
    //B
    //B
    //B
    //B
    //B

// ===================================================================================================================

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.start();

        try {
            Thread.sleep(10);
        }catch (InterruptedException e) {
            throw new RuntimeException();
        }
        b.start();
    }
}

class A extends Thread {
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

class B extends Thread {
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
