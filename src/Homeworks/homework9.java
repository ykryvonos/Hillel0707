package Homeworks;

public class homework9 {
    public static void main(String[] args) {

        String[][] twoArray = {{"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}};

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }
}

