package JAVA_CODES;





public class Factorial {

     public static int fact(int n){
      if(n == 0)
      return 1;
    

   return n * fact(n-1);
 }
    public static void main(String[] args) {
        
        int n = 5;
        int factorial  = 1;
        int fact = fact(n);
        System.out.println(fact);

       
         for(int i=1;i<=n;i++){
 
            factorial = factorial *i;

         }

         System.out.println(factorial);
   



    }
    
}
