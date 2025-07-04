package OOPS;

 interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show");
    }
}

class D implements B, C {
    public void show() {
        // Resolving the conflict manually
        B.super.show();  // or C.super.show();
    }
}

public class Diamond {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();  // Output: B's show
    }
}
