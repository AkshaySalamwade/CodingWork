package JAVA_CODES;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;           // Get last digit
            reversed = reversed * 10 + digit;  // Append digit
            number = number / 10;              // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}

