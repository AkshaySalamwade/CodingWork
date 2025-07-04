import java.util.Scanner;






public class Product_SUM_Diff {


    
    public static void main(String[] args)
    {
        
        System.out.println("Enter A number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }

    private static int subtractProductAndSum(int n) {

        int rem,sum = 0;
        int product = 1;
        int difference = 0;

        while(n != 0){

            rem =  n % 10;
            sum+=rem;
            product *=rem;
            n = n/10;

        }

        difference = product - sum;

        return difference;
    }

}
