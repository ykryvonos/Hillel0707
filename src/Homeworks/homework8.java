package Homeworks;

public class homework8 {
    public static void main(String[] args) {

        int mathOperation = smallerNumber(7, 3);
        System.out.println(mathOperation);
    }

    static int smallerNumber(int a, int b) {
        int number = Math.min(a, b);
        return number;
    }
}