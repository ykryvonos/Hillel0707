package Lessons.lesson11;

public class ternar {
    public static void main(String[] args) {
        String str = "blablabla?";
        String str2 = "blablabla";
        check(str);
        check(str2);

        checkWithTernar(str);
        checkWithTernar(str2);
    }

    public static void check(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("Question in the end");
        } else {
            System.out.println("Without question");
        }
    }

    public static void checkWithTernar(String str) {
        var lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar == '?' ? "Question in the end" : "Without question");
    }
}
