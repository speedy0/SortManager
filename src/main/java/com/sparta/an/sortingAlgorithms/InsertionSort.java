package com.sparta.an.sortingAlgorithms;

public class InsertionSort implements Sorter{
    @Override
    public int[] sort(int[] array) {
        int arrLength = array.length;

        for (int loops = 1; loops < arrLength; ++loops){
            int key = array[loops];
            int index = loops - 1;

            while (index >= 0 && array[index] > key){
                array[index + 1] = array[index];
                index -= 1;
            }
            array[index + 1] = key;
        }

        return array;
    }
}
