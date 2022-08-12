package com.sparta.an.sortingAlgorithms;

import com.sparta.an.random.RandomArray;
import com.sparta.an.sortingAlgorithms.binaryTree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTreeTest {
    @Test
    @DisplayName("Is sorting in correct numerical order")
    void isSortingInCorrectNumericalOrder(){
        int[] randNumbers = {5, 3, 0, 9, 11, 17, 404, 50, 58, 36, 17, 52};
        int[] expected = {0, 3, 5, 9, 11, 12, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(new BinaryTree(randNumbers.length).sort(randNumbers)));
    }

    @Test
    @DisplayName("When passed an array, returns correct length of the array back")
    void whenPassedAnArrayReturnsCorrectLengthOfTheArrayBack(){
        int[] randNumbers = {3, -5, -5, 9, 11, 17, 404, 50, 58, 36, 17, 52, 0};
        int[] expected = {-5, -5, 3, 0, 9, 11, 17, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(expected.length,new BinaryTree(randNumbers.length).sort(randNumbers).length);
    }

    @Test
    @DisplayName("When passing random array, does the length stays the same")
    void whenPassingRandomArrayDoesTheLengthStaysTheSame(){
        int[] randArray = RandomArray.randomArray(50);
        Assertions.assertEquals(50,new BinaryTree(randArray.length).sort(randArray).length);
    }


}
