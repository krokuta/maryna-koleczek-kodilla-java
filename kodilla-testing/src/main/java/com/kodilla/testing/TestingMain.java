package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        System.out.println();

        //Zadanie 6.2
        //test jednostkowy 1
        System.out.println("test calculator - dodawanie:");

        Calculator calculator = new Calculator(7.4, 3.9);

        if(calculator.adding() == 7.4 + 3.9){
            System.out.println("works");
        } else {
            System.out.println("nope...");
        }
        System.out.println();

        //Zadanie 6.2
        //test jednostkowy 2
        System.out.println("test calculator - odejmowanie:");

        if(calculator.subtracting() == 7.4 - 3.9){
            System.out.println("works");
        } else {
            System.out.println("nope...");
        }
        System.out.println();
    }

    }
