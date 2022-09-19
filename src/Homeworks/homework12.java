package Homeworks;

public class homework12 {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "Word";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(hello + world + " ");
            } else if (i % 3 == 0) {
                System.out.print(hello + " ");
            } else if (i % 5 == 0) {
                System.out.print(world + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
