package itea.day1;

public class InterfaceObj {
    int a;
    int b;
    String s ;

    public InterfaceObj( int a, int b){
        this.a = a;
        this.b = b;
    }

    public InterfaceObj( int a, int b, String s){
        this.a = a;
        this.b = b;
        this.s = s;
    }
   void myMethod(TestInterface i){
       i.getSomething(a, b);
   }

   String myMethod2(TestInterface2 i){
       return i.getSomething(s);
   }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
