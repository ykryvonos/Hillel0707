package Lessons.lesson9.overwritting;

public class Cow extends Animal {

    @Override
    public void voice() {
        System.out.println("Мууу");
        super.voice();
    }
}
