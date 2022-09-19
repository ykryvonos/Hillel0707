package Lessons.lesson5;

public class lesson5 {
    public static void main(String[] args) {

//        int[][] twoOimArray = new int[3][4];
//        twoOimArray[0][0] = 5;
//        twoOimArray[0][1] = 4;
//        twoOimArray[0][2] = 4;
//        twoOimArray[0][3] = 4;
//        twoOimArray[0][4] = 4;
//
//        int[][] twoOimArray2 = {{2, 5, 7}, {4, 2, 3}, {2, 3}};
//        // System.out.println(twoOimArray2[1][0]);
//
//        for (int i = 0; i < twoOimArray2.length; i++) {
//            for (int j = 0; j < twoOimArray2[i].length; j++) {
//                System.out.print(" " + twoOimArray2[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] twoOimArray3 = {{2, 5, 7, 11}, {7, 4, 2}, {2, 3, 4, 7}};
//        System.out.println(Arrays.deepToString(twoOimArray3));
//
//        mySum(3, 4);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAndAge("Alex", 25);
    }

    //пользовательски метод
    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }
}

