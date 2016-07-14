package ua.in.dergachovda.map;

public enum  Grade {

    A(5, "A", "Advansed"),
    B(4, "B", "Proficient"),
    C(3, "C", "Basic"),
    D(2, "D", "Developing"),
    F(1, "F", "Incomplete");

    private int number;
    private String letter;
    private String text;

    private Grade(int number, String letter, String text) {
        this.number = number;
        this.letter = letter;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "number=" + number +
                ", letter='" + letter + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
