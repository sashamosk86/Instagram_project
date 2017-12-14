package FromBook;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.*;

public class TestClass implements Cloneable, Comparable, Iterable{

    int age;
    String name;

    public TestClass(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getSum1(){
        System.out.println(2);
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws IllegalAccessException, IOException, CloneNotSupportedException {
        ArrayList<Integer> pq = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            pq.add((int)(Math.random()*100));
        }


        for (int i: pq) {
            System.out.print(i + " + ");
        }

        System.out.print(" = ");

        int sum = 0;
        for (int i: pq) {
            sum +=i;
        }
        System.out.println(sum);




    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

