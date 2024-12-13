package Sorting;

public class insertionStack {

    static void InsertionSort(int[] arr, int n){
        for (int i = 0; i < n; i++){

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        }

    public static void main(String[] args) {
        int[] arr = {10,5,2,1,4};
        int n = arr.length;
        InsertionSort(arr, n);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

