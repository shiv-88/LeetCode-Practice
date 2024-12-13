package Arrays;

public class RotateArray {

    public static void reversePart(int arr[], int Si, int Sj){

        int left = Si;
        int right = Sj;

        while (left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    } //from ReverseSpecefic

    public static void rotateArray(int arr[], int K){

        int N = arr.length;

        K %= N;

        reversePart(arr, 0 , N-1);
        reversePart(arr, 0, K-1);
        reversePart(arr, K, N-1);

    }

    public static void main(String[] args) {

        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        int K = 8;

        rotateArray(arr, K);


        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
