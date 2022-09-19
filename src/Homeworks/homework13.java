package Homeworks;

public class homework13 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 11) + 10);
            sum += array[i];
        }

        System.out.println(sum / array.length);
    }
}

