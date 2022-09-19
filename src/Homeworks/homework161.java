package Homeworks;

import java.util.Scanner;

public class homework161 {
    public static void main(String[] args) {
        int numberOne = getInt();
        int numberTwo = getInt();
        char operation = getOperation();
        int result = calc(numberOne, numberTwo, operation);
        System.out.println("Result: " + result);

    }

    public static int getInt() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        return number;
    }

    public static char getOperation() {
        System.out.println("Put operation (+, -, * or /):");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);

        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You put wrong operation");
                break;
        }
        return result;
    }
}

//Метод int getInt() - должен считывать с консоли целое число и возвращать его
//Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
//Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
//Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(),
//        передать все методу calc() и вывести на экран результат