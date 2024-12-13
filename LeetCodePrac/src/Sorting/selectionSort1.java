package Sorting;

public class selectionSort1 {

    /*
    Modify the Selection Sort code to sort an array of strings in lexicographical (alphabetical) order.
     */


    public static void selectionSort(String[] arr){

        int n = arr.length;

        //to traverse through all arr elements
        for(int i = 0; i < n - 1; i++){

            //to find the minimum element in the unsorted arr
            int minIndex = i;
            for(int j = i + 1;j < n; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }

            //swap
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }

    //print array method

    public static void printArray(String[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"b", "a", "o", "z", "y"};
        selectionSort(arr);
        printArray(arr);

        //without creating a printArray function we are given the output [Ljava.lang.String;@e9e54c2
        //this is the default toString representation of the object.
    }
}
