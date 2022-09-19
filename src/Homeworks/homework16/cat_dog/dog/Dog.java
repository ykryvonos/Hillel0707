package Homeworks.homework16.cat_dog.dog;

import Homeworks.homework16.cat_dog.animal.Animal;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'm a Dog. My name is " + name + ". Gav");
    }
}
