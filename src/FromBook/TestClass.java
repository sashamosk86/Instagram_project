package FromBook;

import domain.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class TestClass{

    int age;
    String name;

    public TestClass(int age, String name){
        this.age = age;
        this.name = name;
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

    public static void main(String[] args) throws IllegalAccessException {
        TestClass2 t2 = new TestClass2(1,"3");
        t2.getSum();
        t2.getDouble();

}
}
