package com.sparta.an.sortingAlgorithms;

public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        for (int loops = 0; loops < array.length - 1; loops++){
            for (int index = 0; index < array.length - 1; index++){
                numberSwapper(array, index);
            }
        }
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
