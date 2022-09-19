package Homeworks.homework16.cat_dog.cat;

import Homeworks.homework16.cat_dog.animal.Animal;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'm a Cat. My name is " + name + ". Mew");
    }
}
