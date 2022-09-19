package Lessons.lesson13;

public class lesson13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " I`m done before continue");
            if (i > 2) {
                continue;
            }
            System.out.println("      " + i + " : i will done two times");
        }
    }
}
