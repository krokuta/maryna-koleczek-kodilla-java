package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //When
        double returnedAverage = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(5.5, returnedAverage, 0.001);
    }
}
