package Lessons.lesson3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели 1");
        } else if (number == 2) {
            System.out.println("Вы ввели 2");
        } else if (number == 3) {
            System.out.println("Вы ввели 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
