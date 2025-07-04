package JAVA_CODES;

public class Palindrome {



    public static void main(String[] args) {
        
    String s1 = "ABCBASA";

    int start = 0;
    int end = s1.length()-1;
    Boolean flag = true;
    System.out.println(s1);

    while (start < end)
    {
        if(s1.charAt(start) != s1.charAt(end)){
            flag = false;
            break;
        }
        start++;
        end--;

    }

    if(flag == true){
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not a Palindorme");
    }

    }
 
}
