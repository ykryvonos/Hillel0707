package mentor.mentor;

public class help {
    public static void main(String[] args) {
        String s = "help";
        new2(s);
    }

    static void new2(String s) {
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s);
            s = s.substring(1) + s.charAt(0);
        }
    }
}
