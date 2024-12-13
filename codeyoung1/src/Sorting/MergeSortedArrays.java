package Sorting;

public class MergeSortedArrays {

    public static int[] mergeSort(int[] A, int[] B){
        int m = A.length;
        int n = B.length;
        int[] C = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j<n){

            if(A[i] <= B[j]){
                C[k] = A[i];
                i++;
            }

            else{
                C[k] = B[j];
                j++;
            }
            k++;
        }

        //extra available for A
        while (i < m){
            C[k] = A[i];
            i++;
            k++;
        }

        //extra availble for B
        while (i < n){
            C[k] = B[j];
            j++;
            k++;
        }
        return C;

    }

    public static void main(String[] args) {
        int[] A = {2,5,7,12,20,24,29};
        int[] B = {6,9,10,11,14,18,19};

        int[] C = mergeSort(A,B);

        for (int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
