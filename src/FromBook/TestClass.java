package FromBook;

import domain.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestClass {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            Class cl = Class.forName("domain.User");
            Field[] fields = cl.getDeclaredFields();
            for (Field c: fields) {
                System.out.println(c.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
