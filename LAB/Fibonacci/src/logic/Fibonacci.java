package logic;

public class Fibonacci {

    /**
     * @param n is the index of Fibonacci number
     * @return the nth Fibonacci number
     */
    public int fibonacciNumber(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    /**
     * print Fibonacci numbers
     */
    public void display(int n) {
        String fibonacciString = "";
        for (int i = 1; i <= n; i++) {
            fibonacciString += (i == n) ? fibonacciNumber(i) : fibonacciNumber(i) + ", ";

        }
        System.out.println(fibonacciString);
    }
}
