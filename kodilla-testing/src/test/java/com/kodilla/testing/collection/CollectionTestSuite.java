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
        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator();
        ArrayList<Integer> testNumbers1 = new ArrayList<Integer>();
        //When
        oddNumbersExterminator1.exterminate(testNumbers1);
        ArrayList<Integer> testEvenNumbers1 = new ArrayList<Integer>();
        ArrayList<Integer> result1 = oddNumbersExterminator1.getEvenNumbers();
        System.out.println("testing empty list");
        //Then
        Assert.assertEquals(testEvenNumbers1, result1);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> testNumbers2 = new ArrayList<Integer>();
        testNumbers2.add(1);
        testNumbers2.add(2);
        testNumbers2.add(3);
        testNumbers2.add(4);
        testNumbers2.add(5);
        testNumbers2.add(6);
        //When
        oddNumbersExterminator2.exterminate(testNumbers2);
        ArrayList<Integer> testEvenNumbers2 = new ArrayList<Integer>();
        testEvenNumbers2.add(2);
        testEvenNumbers2.add(4);
        testEvenNumbers2.add(6);
        ArrayList<Integer> result = oddNumbersExterminator2.getEvenNumbers();
        System.out.println("testing list whit elements");
        //Then
        Assert.assertEquals(testEvenNumbers2, result);
    }
}
