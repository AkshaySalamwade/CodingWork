package JAVA_CODES;


class Parent {
    int x = 10;

    private void privateMethod() {
        System.out.println("Parent privateMethod");
    }

    public void callMethod() {
        privateMethod(); // This will call Parent's private method only
    }

    void show() {
        System.out.println("Parent show()");
    }

    void parentMethod(){
        System.out.println("Parent method()");
    }
}

class Child extends Parent {
    int x = 20;
    // This is NOT overriding, it's a new method although it has same signature.
    private void privateMethod() {
        System.out.println("Parent privateMethod");
    }

    void show() {
        System.out.println("Child show()");
    }

    void childOnlyMethod() {
        System.out.println("Child specific method");
    }
}


public class Test {
    public static void main(String[] args) {

        Parent obj = new Child();
        obj.parentMethod();
        obj.show();
        System.out.println(obj.x);
        obj.callMethod();

       // obj.childOnlyMethod();


        
    }
    
}
