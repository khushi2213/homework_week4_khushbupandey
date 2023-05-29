package homework_week4;

/**5. Palindrome Number
 Write a method called isPalindrome with one int parameter called number.
 The method needs to return a boolean.
 It should return true if the number is a palindrome number otherwise it should return false.*/

import java.util.Scanner;

public class Program5_PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int num = scanner.nextInt();
        System.out.println("Does number : "
                + num + "  is a palindrome? " + isPalindrome(num));
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        return originalNumber == reverse;
    }

}
