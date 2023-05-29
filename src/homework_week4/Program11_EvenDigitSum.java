package homework_week4;

import java.util.Scanner;

/**11. Even Digit Sum
 Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.*/

public class Program11_EvenDigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number  :  ");
        int num = scanner.nextInt();
        System.out.println(getEvenDigitSum(num));
    }

    public static int getEvenDigitSum(int number) {
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigits = lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number" + originalNumber + "is equal to: ");
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid input;  ");
        return -1;
    }

}
