package Lessons.lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //создание объекта или создание экземпляра класса
        cat.sayHello();
        catAction();
    }

    public static void catAction() {
        Cat cat = new Cat();
        cat.jump();
        cat.run();
    }
}
