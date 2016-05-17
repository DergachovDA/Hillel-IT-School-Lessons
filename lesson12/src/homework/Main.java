package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();

        String input = scanner.next();
        Shape shape = shapeFactory.makeShape(input);

        System.out.println(shape);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());

    }

}
