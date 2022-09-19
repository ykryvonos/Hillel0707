package Lessons.lesson14.varArgs;

public class main {

    public static void main(String[] args) {
        int count = addAll(1, 1, 1);
        System.out.println(count);

        int count2 = addAll(2, 2, 2, 2, 2);
        System.out.println(count2);
    }

    public static int addAll(int firstNumber, int seconNumber, int thirdNumber) {
        return firstNumber + seconNumber + thirdNumber;
    }

    public static int addAll(int... numbers) {
        int mathSum = 0;

        for (int num : numbers) {
            mathSum += num;
        }
        return mathSum;
    }
}
