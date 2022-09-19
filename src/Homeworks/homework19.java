package Homeworks;

public class homework19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        arrExtension(a, 7);
    }

    public static int[] arrExtension(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = number;
            }
            System.out.print(newArr[i] + " ");
        }
        return newArr;
    }
}
//Дано : int []a = {1, 2, 3, 4, 5, 6};
//        Написать метод, который будет принимать
//        два параметра:
//        Массив данных
//        Число
//        Метод должен добавлять в конец принимаемого массива
//        число из параметров и возвращать изменённый массив!
//        Без использования метода Arrays.copyOf и подобных!