package ITEA_2;

import java.util.Comparator;
import java.util.TreeSet;

public class MainDog {
    public static void main(String[] args) {
       Owner owner = new Owner("Alex");
        Dog[] dog = new Dog[3];
        dog[0] = new Dog("Tuzik", owner, 2);
        dog[1] = new Dog("Bob", owner, 3);
        dog[2] = new Dog("Ron", owner,4);

        TreeSet<Dog> treeSet = new TreeSet<>();

        treeSet.add(dog[0]);
        treeSet.add(dog[1]);
        treeSet.add(dog[2]);


        System.out.println(treeSet);
    }

}
