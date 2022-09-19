package Lessons.lesson13.abstractExample;

abstract class Car {

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    void countWheels() {
        System.out.println("4");
    }

}
