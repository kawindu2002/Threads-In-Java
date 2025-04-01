package com.lk.kp;

//public class Main {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 2");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        t1.start();
//
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException();
//        }
//
//        t2.start();
//
//        System.out.println("Bye!");
//    }
//}

//Output
    //Thread 1
    //Bye!
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2


/**
    Imagine a Simple Scenario:

    Two people (Tom and Jerry) each want to take turns writing in a notebook.

    Tom writes "Tom's turn!" and then waits for 1 second before writing again.

    Jerry writes "Jerry's turn!" and then waits for 1 second before writing again.

    You, the teacher, are also in the room, and you say "Bye!" while Tom and Jerry are still writing.

    Now, here's how it works:

    Tom starts first and writes "Tom's turn!" in the notebook.

            Then, for a very short time (10 milliseconds), you (the teacher) say "Bye!" without waiting for Tom to finish.

            After that, Jerry starts writing and writes "Jerry's turn!" in the notebook.

    Tom and Jerry will keep writing and waiting, but they will keep switching back and forth because they’re both working at the same time (they take turns writing but don’t have to wait for each other).

    What the program does:
    Thread 1 (Tom) writes "Thread 1" and sleeps for 1 second.

    Thread 2 (Jerry) starts a little later, after 10 milliseconds, and writes "Thread 2".

    Both threads are working at the same time, so their prints get mixed up.

    The main thread (you, the teacher) prints "Bye!" before both Tom and Jerry are done.


    What’s happening here:

    Thread 1 (Tom) starts first and prints "Thread 1".

    Main thread (you, the teacher) prints "Bye!" because it's running in the background.

    Thread 2 (Jerry) starts just a tiny bit later and prints "Thread 2".

    After that, Thread 1 and Thread 2 take turns printing because they both sleep for 1 second after each print.

    The computer decides which thread (Tom or Jerry) gets to write in the notebook at any moment.

    The key points:
    Tom starts first but doesn't finish before Jerry starts.

    Both threads are working together, and they print alternately, but not in a perfect order because the computer decides who gets to write when.

    You, the teacher (the main thread), just says "Bye!" while they're still working.

 */

//----------------------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 2");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        t1.start();
//
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException();
//        }
//
//        t2.start();
//
//        t1.join(); /* Or t2.join(); **/
///**
//        When you start a new thread, it runs in parallel with the main thread (or any other thread).
//        The join() method is used to make the current thread wait for the thread you call join() on to
//        finish before continuing with its execution.
//*/
//        System.out.println("Bye!");
//    }
//}

//Output
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Bye!

//----------------------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(()-> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 2");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException();
//                }
//            }
//        });
//
//        t1.start();
//
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException();
//        }
//
//        t2.start();
//        System.out.println(t2.isAlive());
//
//        t1.join();
//        System.out.println(t2.isAlive());
//
//        t2.join();
//        System.out.println(t2.isAlive());
//
////    IsAlive() eken thread eke status ek pennw.. Wdkrnwnm true pennnw.
//
//        System.out.println("Bye!");
//        System.out.println(t2.isAlive());
//
//    }
//}

//Output
    //Thread 1
    //true
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //Thread 1
    //Thread 2
    //true
    //false
    //Bye!
    //false

//----------------------------------------------------------------------------------------------------------------------
