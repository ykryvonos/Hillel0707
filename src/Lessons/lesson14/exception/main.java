package Lessons.lesson14.exception;

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        writeSomething("bla bla bla");
    }

    public static void writeSomething(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            FileWriter fileWriter2 = new FileWriter("text.txt");
            fileWriter.close();
            fileWriter.write(str);
            fileWriter2.close();
            System.out.println("work in block try");
        } catch (IOException e) {
            System.out.println("Here");
            // e.printStackTrace();
        } finally {
            System.out.println("Lernd theory, please");
        }

        System.out.println("za blockom try i catch");
    }
}
