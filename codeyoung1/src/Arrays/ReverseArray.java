package Arrays;

public class ReverseArray {

    public static void reverse(int arr[]){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            //perform swap function
            int temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {

        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        reverse(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
