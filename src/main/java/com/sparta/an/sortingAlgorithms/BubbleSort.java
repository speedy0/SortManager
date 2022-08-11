package com.sparta.an.sortingAlgorithms;

import com.sparta.an.logger.LoggerSystem;

import java.util.Arrays;

public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        //LoggerSystem.getMessage(1, "About to run the loop with a passed array: " + Arrays.toString(array));
        for (int loops = 0; loops < array.length - 1; loops++){
            for (int index = 0; index < array.length - 1; index++){
                numberSwapper(array, index);
            }
            //LoggerSystem.getMessage(2, "Swapping cycle " + loops + " has finished, returning: " + Arrays.toString(array));
        }
        //LoggerSystem.getMessage(3, "Loop has finished and sorted array is being returned: " + Arrays.toString(array));
        return array;
    }

    private void numberSwapper(int[] array, int i) {
        int temp;
        if (array[i] > array[i+1]){
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }
}
