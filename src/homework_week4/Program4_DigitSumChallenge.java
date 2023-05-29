package homework_week4;
/**4. Digit Sum Challenge
 Write a method with the name sumDigits that has one int parameter called number.
 If the parameter is >= 10 then the method should process the number and return sum of all digits,
 otherwise return -1 to indicate an invalid value.
 The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 negative numbers, so also return -1 for negative numbers.*/

import java.util.Scanner;

public class Program4_DigitSumChallenge {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number  :  ");
        int num= scanner.nextInt();
        System.out.println("Sum of " +num+   " is= "+ sumDigits(num));
    }
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;
        // Convert number to string
        String numberToString = Integer.toString(number);
        // Map through all char of the string
        for(char c : numberToString.toCharArray()) {
            // Convert the char to number again
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
}
