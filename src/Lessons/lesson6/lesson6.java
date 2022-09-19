package Lessons.lesson6;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {

//        String text = "Hello i am Maks";
//
//        if (text.equals("Hello i am Maks")) {
//            System.out.println("ok");
//        } else {
//            System.out.println("fail");
//        }
//        int num = 12346;
//        String temp = String.valueOf(num);
//        System.out.println(temp);

//        String num2 = "45463";
//        int temp2 = Integer.parseInt(num2);

//        double num3 = 5.75;
//        System.out.println(Math.round(num3));
//        System.out.println(Math.floor(num3));
//        System.out.println(Math.ceil(num3));

        String[] myArr = {"hello", "i", "am", "Maks", "Petrov"};
        reverseArray(myArr);

        //       countWords();

    }

    public static void reverseArray(String[] arr) {
        int lengthArr = arr.length;
        String temp;

        for (int i = 0; i < lengthArr / 2; i++) {
            temp = arr[lengthArr - i - 1];
            arr[lengthArr - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static int countWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put string");

        String input = scanner.nextLine();

        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
