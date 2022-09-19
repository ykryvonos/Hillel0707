package Homeworks;

public class homework11 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            if (i < 3) {
                System.out.println("Это " + i + "-й урок!" + "\n" + "    Я выполнил все домашние задания " + i + "-го урока.");
            } else {
                System.out.println("Это " + i + "-й урок!" + "\n" + "    Я не выполнил все домашние задания " + i + "-го урока.");
            }
        }
    }
}
