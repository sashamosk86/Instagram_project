import java.util.*;

public class Test {
    public static void main(String[] args) {
        SortedSet<String> word = new TreeSet<>();
        word.add("bob");
        word.add("klara");
        word.add("kep");

        for (String s: word) {
            System.out.println(s);
        }

    }
}
