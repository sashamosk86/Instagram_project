package FromBook;

public interface TestClassInterface {
    void getSum();
    default void getDouble(){
        System.out.println(444);
    };
}
