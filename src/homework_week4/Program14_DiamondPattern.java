package homework_week4;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Program14_DiamondPattern {

    public static void main(String[] args) {
        diamond();
    }

    public static void diamond() {

        int number = 7;

        int m = 1;

        int n;

        while (m <= number) {
            n = 1;

            while (n++ <= number - m) {

                System.out.print(" ");
            }
            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();

            m++;
        }
        m = number - 1;

        while (m > 0) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;

            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
}


