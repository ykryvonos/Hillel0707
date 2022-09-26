package Lessons.lesson17;

public class Person {
    private String fullname;
    private int age;
    private boolean retires;

    public Person(String fullname, int age, boolean retires) {
        this.fullname = fullname;
        this.age = age;
        this.retires = retires;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", retires=" + retires +
                '}';
    }
}
