package Lessons.lesson14.exception.myexeption;

public class MyExceptionDemo {
    public static void main(String[] args) throws MyExeption {

        compute(9);
        compute(11);
    }

    public static void compute(int a) throws MyExeption {
        System.out.println("Method compute with number " + a);
        if (a > 10) {
            throw new MyExeption(a, "trouble here!");

        }
        System.out.println("Normal close program");
    }
}
