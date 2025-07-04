
import java.util.*;
public class ClimbStairProblem {


    public static void main(String[] args){

        System.out.println("Enter the Number of Step :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int step = climbStairs(n);
        System.out.println("Number of Ways :"+step);


    }

    private static int climbStairs(int n) {


            if(n == 1)
                return 1;

            else if(n == 2)
                return 2;

            int a = 1;  // number of steps required to climb 1st step
            int b = 2;   // number of steps required to climb 2nd step

            for(int i=3; i<=n; i++){

                n = a + b;
                a = b;
                b = n;
            }

            return n;




    }


}
