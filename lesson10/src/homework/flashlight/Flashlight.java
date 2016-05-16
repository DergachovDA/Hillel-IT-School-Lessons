package homework.flashlight;

/*
+ Создайте класс для и определите методы для предмета "Фонарь".
+ У него будет название,
+ определенное количество батареек,
+ которые можно вставить,
+ он должен уметь светить красным, белым светом,
+ а также мигать,
причем для белого света достаточно одной батарейки,
для красного нужно 2,
для мигающего нужно 3
(свойство int battery, которое будет хранить количество батареек для этого подойдет).
Вы можете добавить возможности фонаря, как сочтете нужным.
 */
class Flashlight {

    private String name;
    private int batteries;
    private String[] light;
    private int state;
    private int batteryCompartment;

    Flashlight() {
        name = "New Flashlight";
        batteryCompartment = 3;
        batteries = 1;
        state = 0;
        light = new String[]{"off", "shines white", "shines red", "blinks"};
    }

    private boolean checkState(int state) {
        return state <= batteries;
    }

    void setOff() {
        state = 0;
    }

    void setSinesWhite() {
        int state = 1;
        if (checkState(state))
            this.state = state;
        else {
            System.out.println("The flashlight can not shine white. Not enough batteries!");
        }
    }

    void setSinesRed() {
        int state = 2;
        if (checkState(state))
            this.state = state;
        else {
            System.out.println("The flashlight can not shine red. Not enough batteries!");
        }
    }

    void setBlinks() {
        int state = 3;
        if (checkState(state))
            this.state = state;
        else {
            System.out.println("The flashlight can not blinks. Not enough batteries!");
        }
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void insertBattery() {
        if (batteries + 1 > batteryCompartment)
            System.out.println("The battery compartment is full.");
        else
            batteries++;
    }

    void removeBattery() {
        if (batteries - 1 < 0)
            System.out.println("The battery compartment is empty.");
        else
            batteries--;
    }

    int getBatteries() {
       return batteries;
    }

    void printStateFlashlight() {
        System.out.println(name + " is " + light[state] + ".");
    }

}
