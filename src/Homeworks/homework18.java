package Homeworks;

public class homework18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}