package Homeworks;

public class homework10 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i + 1; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
