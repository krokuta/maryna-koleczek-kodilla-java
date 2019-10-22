package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if(n >= 0 && n < shapes.size()){
            shape = shapes.get(n);
        }
        return shape;
    }

    public ArrayList showFigures(){
        ShapeCollector shapeCollector = new ShapeCollector(shape);
        shapes.add(shape);
        return shapes;
    }

    public int getShapeQuantity(){
        return shapes.size();
    }

    public Shape getShape(){
        return shape;
    }
}
