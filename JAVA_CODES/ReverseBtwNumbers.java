
package JAVA_CODES;

/*
Write a Java program to print all numbers between two integers start and end in reverse order,
 excluding the boundaries

 Start = 10, End = 4
 Output -> 9 8 7 6 5
 * 
 */


public class ReverseBtwNumbers {

    
public static void main(String[] args) {

int start = 10; 
int end = 4;

 if(start>end){
    int temp = start;
    start = end;
    end = temp;
 }

 for(int i=end-1;i>start;i--)
 {
    System.out.print(i+" ");
 }
 



    
}


}