package Conditionals;

public class FactorialPrint {

    //HW: Tower of Hanoi - Transfer n disks from source to destination over 3 towers.

    public static long calculateFactorial(int n){
            long factorial = 1;
            int i = 1;

            do {
                factorial *= i;
                i++;
            } while (i <= n);{
                return factorial;
            }
    }

    public static void main(String[] args) {
        int n = 5;

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(calculateFactorial(n));
        }
    }

}
