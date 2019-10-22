package com.kodilla.testing.shape;

import static java.lang.StrictMath.sqrt;

public class Triangle implements Shape {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String nameShape(){
        return "triangle";
    }

    public double countArea(){
        double p = (a + b + c)/2;
        double area = sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
}
