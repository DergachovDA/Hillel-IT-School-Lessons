package homework;

class Rectangle implements Shape{

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

    public void print() {
        System.out.println("The rectangle with a height of " + height + " and a width of " + width);
    }

}
