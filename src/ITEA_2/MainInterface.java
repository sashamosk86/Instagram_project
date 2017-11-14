package ITEA_2;

public class MainInterface{
    public static void main(String[] args) {
        TestInterface i = new TestInterface() {
            @Override
            public void getSomething(int a, int b) {
                System.out.println("Hello");
            }
        };

     //   i.getSomething(a, b);

        InterfaceObj obj = new InterfaceObj(2,3);
        obj.myMethod((a,b)->{
            System.out.println(a+b);
        });


        InterfaceObj obj2 = new InterfaceObj(2,3, "Blue Car");
        obj2.myMethod2((s) ->{
            String x = s;
            System.out.println(x);
            return x;
        });

    }

}
