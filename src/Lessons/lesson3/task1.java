package Lessons.lesson3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;

        System.out.println("Введите имя: ");
        Scanner scannertext = new Scanner(System.in);
        String name = scannertext.nextLine();

        System.out.println(name + " " + result);
    }
}
