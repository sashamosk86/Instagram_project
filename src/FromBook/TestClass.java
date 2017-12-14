package FromBook;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.*;

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
public class TestClass {

    public static void main(String[] args) throws IllegalAccessException, IOException, CloneNotSupportedException {
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(5));
        set.add(new Person(2));
        for (Object o: set) {
            System.out.println(o);
        }
    }

}

