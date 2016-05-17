package homework;

class Square extends Shape {

    private int side;

    Square(int a) {
        this.side = a;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 2 * side;
    }

    public String toString() {
        return "The square with a side: " + side;
    }

}
