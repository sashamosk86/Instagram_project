package itea.day1;

public class Owner implements DogInt{
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOwnerName() {
        return name;
    }
}
