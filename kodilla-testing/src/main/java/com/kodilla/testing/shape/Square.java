package com.kodilla.testing.shape;

public class Square implements Shape {
    double a;
    double b;

    Square(double a, double b){
        this.a = a;
        this.b = b;
    }

    public String nameShape() {
        return "square";
    }

    public double countArea(){
        double area = a * b;
        return area;
    }
}
