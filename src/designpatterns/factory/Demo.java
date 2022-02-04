package designpatterns.factory;

import designpatterns.factory.shape.Shape;
import designpatterns.factory.shape.ShapeFactory;

public class Demo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape square = ShapeFactory.getShape("square");
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
