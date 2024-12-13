package recursion;

public class stackHeight {

    //print x^n(stack height = n) using recursion.
    //use math

    public static void printX(int x, int n, int curr){
        //Hw : print x^n(stack height =log n) using recursion.


        /*
        int x = base
        int n = exponent
        int curr = current stack height
         */

        if (curr <= n){
            double result = Math.pow(x, curr);
            System.out.println("Stack Height: " + curr  + " - " + x + "^" + n + " = " + result);
            printX(x, n , curr + 1);

        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        printX(x,n,0);
    }
}
