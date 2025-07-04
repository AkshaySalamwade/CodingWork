package Wissen_code;

import java.util.Arrays;

/*
 * Program to Check if Two Strings Are Anagrams -
 * Write a Java program to check whether two strings are anagrams of each other.
Two strings are anagrams if they contain the same characters in the same frequency, case-insensitive.
 
Input: str1 = "listen", str2 = "silent"
*/

public class Anagram {

    public static void main(String[] args) {
        
        String str1 = "Listen";
        String str2 = "Silent";


        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()){
            System.out.println("Not a Anagram...");
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is Not Anagram");
        }



    }
    
}
