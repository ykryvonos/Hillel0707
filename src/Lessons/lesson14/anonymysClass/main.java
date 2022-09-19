package Lessons.lesson14.anonymysClass;

public class main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String sayHello() {
                return "Hi";
            }
        });
    }
}
