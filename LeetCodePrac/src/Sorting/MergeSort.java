package Sorting;

public class MergeSort {

    public void mergeSort(int[] A, int l, int r){

        if (l < r){
            int mid = (l + r) / 2;
            mergeSort(A, l, mid);
            mergeSort(A, mid + 1, r);
            merge(A, l, mid, r);
        }

    }

    public void merge(int[] arr, int l, int mid, int r){



        int n = mid - l + 1; //size of left subarray
        int n1 = r - mid; //size of right subarray

        //to do: create 2 new arrays, then copy data from the new arrray

        int[] leftArr = new int[n];
        int[] rightArr = new int[n1];

        //copy data

        for (int i = 0; i < n -1 ; i++){
            leftArr[i] = arr[l+i];
        }

        for (int j = 0; j < n1; j++){
            rightArr[j] = arr[mid + 1 + j];
        }


        //indices for iteratring through the array

        int i = 0, j = 0;

        //int k
        int k = l;

        //merge left and right subarray into original array
        while(i < n && j < n1){

            if(leftArr[i] <= rightArr [j]){
                arr[k] = leftArr[i];
                i++;
            }

            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //extra availoble for left
        while(i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < n1){
            arr[k] = rightArr[j];
            j++;
            k++;

        }

    }

}
