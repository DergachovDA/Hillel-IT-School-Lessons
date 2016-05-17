package homework;

public class ShapeFactory {

    public Shape makeShape(String type) {
        Shape shape = null;
        switch (type) {
            case "circle":
                shape = new Circle(1);
                break;
            case "square":
                shape = new Square(1);
                break;
            case  "rectangle":
                shape = new Rectangle(1, 1);
                break;
        }
        return shape;
    }

}
