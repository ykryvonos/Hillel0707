package Lessons.lesson14.outerclasses;

public class OutterLockal {

    void my_Method() {
        int num = 888;


        class MethodInner_Demo {
            //локальный метод внутреннего класса
            void print() {
                System.out.println("this is method inner class " + num);
            }
        }
        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();
    }
}
