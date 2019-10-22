package com.kodilla.testing.shape;

public class Circle implements Shape {
    double r;

    public Circle(double r){
        this.r = r;
    }

    public String nameShape(){
        return "circle";
    }

    @Override
    public double countArea() {
        double area = 3.14 * r * r;
        return area;
    }

    public double getR(){
        return r;
    }
}
