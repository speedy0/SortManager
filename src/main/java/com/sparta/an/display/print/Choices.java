package com.sparta.an.display.print;

public class Choices {
    public static void printChoices(String[] choices){
        System.out.println("This program can sort random array using following algorithms:");
        for (int i = 0; i <= choices.length - 1; i++){
            System.out.println((i+1) + ". " + choices[i]);

            if (i == choices.length - 1){
                System.out.println((i+2) + ". All sorting methods");
            }
        }
    }
}
