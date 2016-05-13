package game;

public class Player {

    private String lastname;
    private String firstname;
    private String middlename;
    private int age;
    private char type;

    public Player(String lastname, String firstname, String middlename, int age, char type) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

}
