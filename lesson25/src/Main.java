public class Main {
    public static void main(String[] args) {
        int fruitType = Fruit.APPLE_RED;
        int wrongFruitType = 5;

        Apple redApple = Apple.RED;

        Cat barsik = new Cat("Barsik", 5, Color.BLACK);
        Cat murzik = new Cat("Murzik", 7, Color.WHITE);

        switch (barsik.getColor()) {
            case BLACK:
                System.out.println(barsik.getName() + " " + barsik.getColor());
                break;
            case WHITE:
                System.out.println(barsik.getName() + " " + barsik.getColor());
                break;
            default:
                System.out.println("No color is set");
        }

        for (Color color : Color.values()) {
            System.out.println(color + " " + color.ordinal());
        }

        CatExt cat = new CatExt("Fat Cat", 8, ColorExt.RED);
        String catColor = cat.getColor().getColorValue();
        System.out.println(catColor);
    }
}
