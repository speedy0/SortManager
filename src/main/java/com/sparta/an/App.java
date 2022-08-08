package com.sparta.an;

import com.sparta.an.random.RandomArray;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        int[] randArray = RandomArray.randomArray(100);
        System.out.println(Arrays.toString(randArray));
    }
}
