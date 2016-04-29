package less12.homework;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        circle.print();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }

}
