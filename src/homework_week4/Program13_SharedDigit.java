package homework_week4;

import java.util.Scanner;

public class Program13_SharedDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter Number1:  ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Number2:  ");
        System.out.println(hasSharedDigit(num1, num2));
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 10 || number1 > 99) && (number2 < 10 || number2 > 99)) {
            return false;
        }

        int numberOneFirstDigit = number1 / 10;
        int numberTwoFirstDigit = number2 / 10;
        int numberOneLastDigit = number1 % 10;
        int numberTwoLastDigit = number2 % 10;

        if (numberOneFirstDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoLastDigit || numberOneLastDigit == numberTwoLastDigit) {
            return true;
        } else {
            return false;
        }
    }
}