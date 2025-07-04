package OOPS;

public class Sample {
    public static void main(String[] args) {
        int a = 1;

        A aObj = new A(1);

        modify(a, aObj);

        System.out.println(a);            // Line 1
        System.out.println(aObj.getA());  // Line 2
    }

    private static void modify(int a, A aObj) {
        a = 2;                   // Primitive change → won't affect original
        aObj.setA(2);            // Object's field modified → affects original
    }
}

class A {
    int a;

    public A(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }
}
