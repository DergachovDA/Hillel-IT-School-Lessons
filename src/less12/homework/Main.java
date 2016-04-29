package less12.homework;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(3, 5);

        for (Shape shape : shapes) {
            shape.print();
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }

    }

}
