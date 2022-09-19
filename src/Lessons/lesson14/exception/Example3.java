package Lessons.lesson14.exception;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Print number");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int[] a = {3, 4, 5};

        try {
            System.out.println(a[b] / 0);
        } catch (IndexOutOfBoundsException | ArithmeticException y) {
            System.out.println("something went wrong");
        }
    }
}
