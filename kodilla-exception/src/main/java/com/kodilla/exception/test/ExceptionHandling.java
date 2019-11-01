package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.0, 2.0);
        } catch (Exception e){
            System.out.println("Nope... Error: " + e);
        } finally {
            System.out.println();
            System.out.println("End of program");
        }
    }
}
