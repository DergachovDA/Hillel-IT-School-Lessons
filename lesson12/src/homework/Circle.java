package homework;

class Circle implements Shape {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("The circle with a radius: " + radius);
    }


}
