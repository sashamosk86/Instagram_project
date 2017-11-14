package ITEA_2;

public class Dog{
    private String name;
    private int age;
    //Owner owner = new Owner();
    DogInt n;

    public Dog(String name, DogInt n, int age) {
        this.name = name;
        this.n = n;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DogInt getN() {
        return n;
    }

    public void setN(DogInt n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + n.getOwnerName() +
                '}';
    }
}
