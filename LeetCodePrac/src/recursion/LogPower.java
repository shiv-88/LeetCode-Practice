package recursion;

public class LogPower {

    //print x^n(stack height =log n) using recursion.

    public static void printXtoN(int x, int n, int currStackHeight){
        if (currStackHeight <= log2(n)){
            double result = Math.pow(x,currStackHeight);
            System.out.println(x + "^" + currStackHeight + " = " + result);
            printXtoN(x,n,currStackHeight + 1);
        }
    }

    private static int log2(int n){return (int) (Math.log(n)/Math.log(2));}

    public static void main(String[] args) {
                   int x = 2;
            int n = 16;
        printXtoN(x,n,0);
        }
    }



