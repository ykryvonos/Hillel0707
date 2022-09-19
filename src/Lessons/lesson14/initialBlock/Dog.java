package Lessons.lesson14.initialBlock;

public class Dog {

    private String name;
    private String poroda;
    private int age;

    {
        name = "Sharik";
        poroda = "ovcharka";
        age = 2;
        System.out.println("This is not static initialitioan block");
    }

    public Dog(String name, String poroda, int age) {
        System.out.println("i am here");
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public Dog() {

    }
}
