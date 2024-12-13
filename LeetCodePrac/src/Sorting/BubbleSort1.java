package Sorting;

public class BubbleSort1 {

    public static void bubbleSort(int[] arr){

        int n = arr.length;
        boolean swap;

        for (int i = 0; i < n-1; i++) {
            swap = false;


            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if (!swap){break;}

            }

        }

    public static void main(String[] args) {
        int[] arr = {10,5,2,1,4};
        bubbleSort(arr);
        System.out.println("Arry out:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
