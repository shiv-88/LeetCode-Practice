import java.lang.Math;

//isPrime
public class main {

    public boolean isPrime(int N){
     int count = 0;

     for (int i = 1; i <= Math.sqrt(N); i++){
         if (N % i == 0){
             if (i*i == N){
                 count += 1;
             }
             else count += 2;
         }

     }
    if (count == 2) return true;
    return false;

    }

    public static void main(String[] args) {
        main m = new main();
        System.out.println(m.isPrime(100));
    }


}
