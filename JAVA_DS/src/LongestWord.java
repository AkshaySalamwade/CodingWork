
/*
Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and
return the longest word in the string.
If there are two or more words that are the same length,
return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty.
Words may also contain numbers, for example "Hello world123 567"

Input: "fun&!! time"
Output: time

Input: "I love dogs"
Output: love

 */

import java.util.*;
import java.io.*;


public class LongestWord {


        public static String LongestWord(String sen) {

            String[] wordArray = sen.split("[^a-zA-Z]");
            String largeWord = wordArray[0];

            for(String word : wordArray){

                if(word.length() >= largeWord.length())
                {
                    largeWord = word;
                }

            }


            return largeWord;
        }

        public static void main (String[] args) {
            // keep this function call here

            System.out.print("Enter a Sentence");
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));
        }

    }


