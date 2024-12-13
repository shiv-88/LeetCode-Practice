package recursion;

public class factorialNum {

    public static int fact(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        else return fact(n-1)*n;
    }

    public static void main (String[] args){
        int n = 5; //120
        System.out.println(fact(n));
    }

}
