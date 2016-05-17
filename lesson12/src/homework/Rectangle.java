package homework;

class Rectangle extends Shape{

    private int height;
    private int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return height + width;
    }

    public String toString() {
        return "The rectangle with a height of " + height + " and a width of " + width;
    }

}
