package OOPS;

public class GCDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            GCDemo obj =  new GCDemo(); // eligible for GC
            System.out.println(obj.getClass().getName()+" "+i);

        }
        System.gc();  // Suggest GC (not guaranteed)
        System.out.println("Requested GC");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected");
    }
}

