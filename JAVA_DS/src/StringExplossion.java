
/*

Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

 */




import java.util.*;

public class StringExplossion {


    public static void main(String[] args){
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(stringSplosion(str));
    }

    private static String stringSplosion(String str) {
        String outputString = "";

        for(int i=0; i<str.length();i++)
        {
            outputString +=str.substring(0,i+1);

        }

        return outputString;
    }
}
