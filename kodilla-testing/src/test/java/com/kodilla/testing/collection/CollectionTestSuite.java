package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testEvenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        //When
        oddNumbersExterminator.exterminate(testNumbers);
        ArrayList<Integer> result1 = oddNumbersExterminator.getEvenNumbers();
        //Then
        Assert.assertEquals(testEvenNumbers, result1);
        System.out.println("testing empty list");

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        testNumbers.add(6);
        ArrayList<Integer> testEvenNumbers = new ArrayList<Integer>();
        testEvenNumbers.add(2);
        testEvenNumbers.add(4);
        testEvenNumbers.add(6);
        //When
        oddNumbersExterminator.exterminate(testNumbers);
        ArrayList<Integer> result = oddNumbersExterminator.getEvenNumbers();
        System.out.println("testing list whit elements");
        //Then
        Assert.assertEquals(testEvenNumbers, result);
    }
}
