package Lessons.lesson7;

public class lesson7 {
    public static void main(String[] args) {

//
        int month = 5;
//
//        String monthString = null;
//        switch (month) {
//            case 1:
//                monthString = "January";
//                break;
//            case 2:
//                monthString = "February";
//                break;
//            case 3:
//                monthString = "March";
//                break;
//            default:
//                monthString = "I don`t know this month";
//        }
//        System.out.println(monthString);
//
//        double a = Math.random();
//        System.out.println(a);

//        double b = Math.random() * 3; // [0,3)
//        System.out.println(a);
//
//        double c = Math.random() + 2; //[2,3)
//        System.out.println(c);

//        int m = (int) (Math.random() * 3); //[0,2]
//        System.out.println(m);


//        String text = "Hello my name is Maks";
//        String[] words = text.trim().split(" ");
//
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        System.out.println(words.length);
        arrayMaks();


    }
//Написать программу, в которой создаётся целочисленный
// массив из 8 случайных чисел из диапозона  [0, 99]
// и выводит максимальный элемент массива в консоль.

    public static void arrayMaks() {
        int max = 0;
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
