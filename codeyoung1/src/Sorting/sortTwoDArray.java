package Sorting;

public class sortTwoDArray {
    //Implement Selection Sort to sort a 2D array of integers in ascending order based on the values in the first column.

    /*



     */

    public static void selectionSort(int[][] arr){
        int n = arr.length;

        for(int i=0; i<n-1;i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                //how to compare MATRIX values || how to cpmpare based on "values in the first column
                if (arr[j][0] < arr[minIndex][0]){
                    minIndex = j;
                }
            }
            int[] temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    //to overridde print method
    public static void printarr(int [][] arr){
        //row traversal
        for (int i = 0; i < arr.length; i++){
            //column traversal
            for(int j = 0; j < arr[i].length; j++){
                //print element at current row and column
                System.out.printf("%4d", arr[i][j]); //%4d = 4 integers wide
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {

                {64, 25, 12},
                {22, 11, 90},
                {30, 45, 55}

        };

        selectionSort(arr);
        printarr(arr);
    }
}
