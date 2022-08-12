package com.sparta.an.random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RandomArrayTest {
    @Test
    @DisplayName("Is the length equal")
    void IsTheLengthEqual(){
        int[] expectedLength = new int[10];
        Assertions.assertEquals(expectedLength.length, RandomArray.randomArray(10).length);
    }

    @Test
    @DisplayName("When designing an array, retuns an array with no negative numbers.")
    void whenDesigningAnArrayRetunsAnArrayWithNoNegativeNumbers(){
        int min = Arrays.stream(RandomArray.randomArray(100)).min().getAsInt();
        Assertions.assertTrue(min >= 0);
    }

    @Test
    @DisplayName("When creating an array, returns an array with no number higher than 1000.")
    void whenCreatingAnArrayReturnsAnArrayWithNoNumberHigherThan1000(){
        int max = Arrays.stream(RandomArray.randomArray(100)).max().getAsInt();
        Assertions.assertTrue(max <= 1000);
    }


}
