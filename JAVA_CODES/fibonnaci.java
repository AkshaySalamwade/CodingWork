package JAVA_CODES;

public class fibonnaci {
    
    public static void main(String[] args) {
        
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a+", "+b+", ");
        for(int i = 2; i<=n;i++){

             int c = a+b; 
             a = b;
             b = c;
             System.out.print(c+", ");


        }

        



    }
}
