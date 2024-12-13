package recursion;

public class power {

    public static int pow(int a, int n){
        if (n==0){return 1;}

        int halfpow = pow(a,n/2);
        int halfans = halfpow*halfpow;


        if (n%2 == 0){return halfans;}
        else {return a * halfans;}
    }

    public static void main (String[] args){
        int a = 2;
        int n = 5;
        System.out.println(pow(a,n));
    }
}
