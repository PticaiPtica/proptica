package HomeWork;

import java.awt.*;
import java.util.Random;

public class Construck {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}

class Square {
    int width;

    public Square(int width) {
        this.width = width;
    }

    public int getPerimeter() {
        return 4 * width;
    }

    public int getArea() {
        return width * width;
    }
}
class Rectangle extends Square {
    int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public int getArea() {
        return width * height;
    }
}