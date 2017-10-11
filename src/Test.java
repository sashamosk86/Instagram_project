import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();
        staff.add("Sasha");
        staff.add("Tania");
        staff.add("Slava");

        Iterator iterator = staff.iterator();
        iterator.next();
        iterator.next();

        ListIterator<String> iter = staff.listIterator();
        iter.next();
        iter.next();
        iter.add("Bob");
        iter.previous();
        iter.set("Klara");
        //iter.add("Bob");
        System.out.println(staff);
    }
}
