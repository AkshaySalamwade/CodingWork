
class A {
    synchronized void methodA(B b) {
        System.out.println("Thread-1: Trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread-2: Trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}


public class DeadlockExample  extends Thread{

  public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(() -> a.methodA(b));  // locks A, tries B
        Thread t2 = new Thread(() -> b.methodB(a));  // locks B, tries A

        t1.start();
        t2.start();
    
  }
    
}
