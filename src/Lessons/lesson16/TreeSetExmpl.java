package Lessons.lesson16;

import java.util.TreeSet;

public class TreeSetExmpl {
    public static void main(String[] args) {

        TreeSet<String> myTreeSetExmpl = new TreeSet<>();

        myTreeSetExmpl.add("C");
        myTreeSetExmpl.add("D");
        myTreeSetExmpl.add("E");
        myTreeSetExmpl.add("R");
        myTreeSetExmpl.add("A");
        myTreeSetExmpl.add("A");

        System.out.println(myTreeSetExmpl);
    }
}
