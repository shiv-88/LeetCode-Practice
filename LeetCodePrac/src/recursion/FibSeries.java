package recursion;

public class FibSeries {


    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        long n = 4;
        System.out.println(fib(n));
    }

    // how this works :
    /*

    fib(4) = fib(3) + fib(2)
        fib(2) = fib(1) + fib(0) = 1+0 = 1
       fib(3) = fib(2) + fib(1) = 1 + 1 = 2

    fib(4) = 2 + 1 = 3
    ans should be 3.
     */
}
