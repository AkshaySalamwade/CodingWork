package functional_interface;

@FunctionalInterface
public interface MyInterface {

    public void sayhello();

    default void  sayBye(){
        System.out.println("Bye....");
    };

    static  void  sayHii(){}



}
