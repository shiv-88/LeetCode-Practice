package hashSets;

import java.util.HashSet;

public class AmazingNumber {

    public static int isAmazingNumber(int A){

        String numberString = Integer.toString(A);
        int n = numberString.length();
        int sum = 0;

       while (A > 0){
           int digit = A %10;
           sum = sum + digit;
           A = A /10;
       }

        HashSet<Integer> products = new HashSet<>();

       return sum % 4 == 0 ? 1 : 0;
             /*
        for (int i = 0; i < n; i++){ //Iterate through all possible starting indices
            int product = 1;


            for (int j = i; j < n; j++){ //iterate thru all possible ending indices of subsequences

                int digit = numberString.charAt(j) - '0'; // extracting individual digit from numberString at index J


                if (digit != 0){
                    //Multiply the product w curr digit
                    product *= digit;

                    if (j > i){
                        products.add(product);
                    }

                }
            }

        }

        //return 1 if there is only one element, return 1 if is amazing, return 0 is not.
        return products.size() == 1 ? 1 : 0;
*/
    }



    public static void main(String[] args) {

        int A = 23;
        //expected output = 1

        int B = 236;
        //expected output = 0

        int C = 3245;

        int amazing = isAmazingNumber(A);
        int amazingB = isAmazingNumber(B);
        int amazingC = isAmazingNumber(C);
        System.out.println(amazing);
        System.out.println(amazingB);
        System.out.println(amazingC);
    }
}
