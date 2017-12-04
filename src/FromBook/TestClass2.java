package FromBook;

public class TestClass2 extends TestClass implements TestClassInterface{

    public TestClass2(int age, String name) {
        super(age, name);
    }

    @Override
    public void getSum() {
        System.out.println(22);
    }

}
