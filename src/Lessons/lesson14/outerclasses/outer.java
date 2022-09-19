package Lessons.lesson14.outerclasses;

public class outer {
    int num;

    private static class inner_Demo {
        public void print() {
            System.out.println("this is inner class");
        }
    }

    void displayInner() {
        inner_Demo inner_demo = new inner_Demo();
        inner_demo.print();
    }
}
