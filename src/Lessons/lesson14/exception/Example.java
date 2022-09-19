package Lessons.lesson14.exception;

public class Example {
    public static void main(String[] args) {
        int a = 5;
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException y) {
            System.out.println("Can`t / na nol`");
        }

        System.out.println("Program works");
    }
}
