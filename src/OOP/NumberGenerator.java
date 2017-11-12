package OOP;

public class NumberGenerator {
    private int current;

    public NumberGenerator() {
        current = 1;
    }

    public int getNext(){
        int result = this.current;
        current++;
        return result;

    }
}
