package com.lk.kp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        PrintData printData = new PrintData();

        Thread t1 = new Thread(() -> {
        });

        Thread t2 = new Thread(() -> {
        });
    }
}

class PrintData{
    int printNum = 0;
    synchronized void print(){
        System.out.println(printNum);
    }
}

class InputData{
    int inputNum = 0;
    synchronized void inputNumber(){
        Scanner input = new Scanner(System.in);
        inputNum = input.nextInt();
    }
}



