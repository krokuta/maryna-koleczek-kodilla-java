package com.kodilla.testing.calculator;

public class Calculator {
    double a;
    double b;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double adding(){
        double add;
        add = a + b;
        return add;
    }

    public double subtracting(){
        double sub;
        sub = a - b;
        return sub;
    }
}
