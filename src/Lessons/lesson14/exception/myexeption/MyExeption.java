package Lessons.lesson14.exception.myexeption;

public class MyExeption extends Throwable {
    private int detail;

    public MyExeption(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyExeption{" +
                "detail=" + detail +
                " " + getMessage() +
                '}';
    }
}

