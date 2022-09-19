package Lessons.lesson7;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        consolOutput();
        String textFromScanner = getInputString();
        String[] arrAfterSplit = arrayFromStr(textFromScanner);
        String[] arrAfterReverce = reverseArray(arrAfterSplit);
        printArray(arrAfterSplit);
    }

    private static void printArray(String[] arr) {
        for (String array : arr) {
            System.out.println(array);
        }
    }

    private static String[] reverseArray(String[] arrText) {
        String[] reversArr = arrText;
        int count = arrText.length;
        String temp = null;

        for (int i = 0; i < count / 2; i++) {
            temp = reversArr[count - i - 1];
            reversArr[count - i - 1] = reversArr[i];
            reversArr[i] = temp;
        }
        return reversArr;
    }

    private static String[] arrayFromStr(String str) {
        String[] arr = str.trim().split(" ");
        return arr;
    }

    private static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static void consolOutput() {
        System.out.println("Print some text");
    }
}
//Написать программу, в которой пользователю предлогается ввести в консоль текст "Привет меня зовут Максим".
// Далее создать массив и записать каждое слово в отдельный элемент массива.
// Вывести в консоль строку из элементов массива в обратном порядке используя формулу  n-i-1.
//Каждое действие должно выполняться в отдельном методе! Т.е. В методе main только вызов пользовательских методов!

