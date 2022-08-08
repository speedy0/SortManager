package com.sparta.an.random;

import java.util.Random;

public final class RandomArray
{
    public static int[] randomArray(int lengthOfArray){
        Random rand = new Random();
        int[] randArray = new int[lengthOfArray];

        for (int i = 0; i <= randArray.length - 1; i++){
            randArray[i] = rand.nextInt(1000);
        }

        return randArray;
    }
}
