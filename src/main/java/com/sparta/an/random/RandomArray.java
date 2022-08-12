package com.sparta.an.random;

import com.sparta.an.logger.LoggerSystem;

import java.util.Random;

public final class RandomArray
{
    public static int[] randomArray(int lengthOfArray){
        Random rand = new Random();
        int[] randArray = new int[lengthOfArray];

        for (int i = 0; i <= randArray.length - 1; i++){
            randArray[i] = rand.nextInt(1000);
        }

        LoggerSystem.getMessage(4, "Produced a random array with length of " + randArray.length);

        if (randArray.length == 0){
            LoggerSystem.getMessage(5, "Random array has returned empty.");
        }
        return randArray;
    }
}
