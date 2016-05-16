package homework.flashlight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Flashlight flashlight = new Flashlight();

        flashlight.printStateFlashlight();

        while (true) {
            switch (scanner.next()) {
                case "set":
                    System.out.println("Name:");
                    flashlight.setName(scanner.next());
                    break;
                case "off":
                    flashlight.setOff();
                    break;
                case "white":
                    flashlight.setSinesWhite();
                    break;
                case "red":
                    flashlight.setSinesRed();
                    break;
                case "blinks":
                    flashlight.setBlinks();
                    break;
                case "insert":
                    flashlight.insertBattery();
                    break;
                case "remove":
                    flashlight.removeBattery();
                    break;
                case "showBat":
                    System.out.println("Batteries in the " + flashlight.getName() + ": " + flashlight.getBatteries());
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Error!");
            }
            flashlight.printStateFlashlight();
        }

    }

}
