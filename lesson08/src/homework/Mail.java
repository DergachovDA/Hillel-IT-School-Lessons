package homework;

import java.util.Scanner;

//  1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
//      @ заменяется на [ at ]
//      . заменяется на [ dot ]
//  Пример ввода:           |    Результат:
//      person@gmail.com    |        person[ at ]gmail[ dot ]com

public class Mail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        System.out.println(email.replace("@", "[ at ]").replace(".", "[ dot ]"));

    }

}
