package Lessons.lesson8;

public class PolimorfizmOverLoad {
    public static void main(String[] args) {

        int a = 100;
        double b = 1.1;
        String c = "Alex";
        add();
        add(a, a);
        add(b, b);
        add(c, a);
    }


    public static void add() {
        System.out.println("Hello");
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void add(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    public static void add(String a, int b) {
        System.out.println(a + " " + b);
    }
}

