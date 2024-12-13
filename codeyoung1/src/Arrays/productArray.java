package Arrays;

public class productArray {

    public static int[] prodArray(int[] A){
        int[] prefixProd = new int[A.length];
        prefixProd[0] = A[0];
        for (int i = 1; i < A.length; i++){
            prefixProd[i] = prefixProd[i-1]*A[i];
        }
        //return prefixSum;

        int[] suffixProduct = new int[A.length];
        suffixProduct[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--){
            suffixProduct[i] = suffixProduct[i + 1] * A[i];
        }
       // return suffixProduct;

        for(int i = 0; i < A.length; i++){
            if (i == 0){
                A[i] = suffixProduct[i+1];
            }
            else if (i == A.length - 1){
                A[i] = prefixProd[i-1];
            }
            else {
                A[i] = prefixProd[i - 1] * suffixProduct[i + 1];
            }
        }
        return A;
    }

    public static void main (String[] args){
        int[] A = {1,2,3,4,5};
        int[] answer = prodArray(A);
        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
