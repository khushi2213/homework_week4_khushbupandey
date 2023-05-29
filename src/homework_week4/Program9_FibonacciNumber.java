package homework_week4;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Program9_FibonacciNumber {
    public static void main(String[] args) {
        fibonacciNum();
    }

    public static void fibonacciNum() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
