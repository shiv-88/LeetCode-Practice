package Sorting;

public class QuickSort {

    public static void quickSort(int [] A, int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = A[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;



        while (leftPointer < rightPointer){
            while (A[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (A[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(A, leftPointer, rightPointer);
        }
        swap(A, leftPointer, highIndex); // when sort is over, swap the pivot and the left pointer
        quickSort(A, lowIndex, leftPointer - 1); // sort the left side of the pivot, leftpointer ends off at leftPointer s
        quickSort(A, leftPointer + 1, highIndex);

    }
    public static void swap(int[] A, int idx1, int idx2){
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;

    }

    public static void main(String[] args){
        int[] a = {1,8,3,4,5,9,7};
        int N = a.length;
        quickSort(a, 0, N - 1);

        for(int i = 0; i < N; i++){
            System.out.print(a[i] + " ");
        }
    }
}
