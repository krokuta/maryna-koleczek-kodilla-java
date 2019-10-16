package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers){
        for(int n = 0; n<numbers.size(); n++){
            Integer element = numbers.get(n);
            if(element % 2 == 0){
                evenNumbers.add(element);
            }
        }
    }
    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}