package com.sparta.an.print;

public class TimerPrint {
    public static void printTimer(double start, double end){
        System.out.println("Time taken for BubbleSort: " + ((end - start) / 1000000));
    }
}
