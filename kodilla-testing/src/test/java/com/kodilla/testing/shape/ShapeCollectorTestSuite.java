package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(4.9));
        //When
        shapeCollector.addFigure(shapeCollector.getShape());
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(4.9));
        shapeCollector.addFigure(shapeCollector.getShape());
        //When
        boolean result = shapeCollector.removeFigure(shapeCollector.getShape());
        //Then
        Assert.assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(4.9));
        shapeCollector.addFigure(shapeCollector.getShape());
        //When
        shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shapeCollector.getShape(), shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(4.9));
        //When
        shapeCollector.shapes.add(shapeCollector.getShape());
        //Then
        Assert.assertEquals(shapeCollector.getShape(), shapeCollector.shapes.get(0));
    }
}
