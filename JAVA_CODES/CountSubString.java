package JAVA_CODES;
// Write a java code to count the Total Number of SubStrings 
// direct formula to find is n*(n+1)/2
/*
suppose there is number 1234
n(size) = 4

substring with size 1 - 4(1,2,3,4)
substring with size 2 - 3(12,23,34) (n-i+1) i is 2 
substring with size 3 - 2(123,234)  (4-3+1) = 2

*/
public class CountSubString {
    
    public static void main(String[] args) {
        String s1 =  "12345";
        int n = s1.length();
        int count = n ;
        for(int i=2; i<=n-1;i++)
        {
           count += (n-i+1);
        }
        System.out.println(" NUMEBR OF SUBSTRINGS  --"+(count+1));
    }
}
