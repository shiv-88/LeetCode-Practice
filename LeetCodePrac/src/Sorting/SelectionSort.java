package Sorting;

public class SelectionSort {

    static void SelectionSort(int[] arr, int n){

        for (int i = 0; i < n - 1; i++){

            int minIndex = i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //segment where swapping occurs
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,1,4};
        int n = arr.length;
        SelectionSort(arr, n);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
