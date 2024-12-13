package BinarySearch;

public class rotatedArraySearch {

    public static int SearchRoatatedArray(int[] arr, int k){

        int left = 0;
        int right = arr.length - 1;

        int pivot = -1;
        System.out.println(pivot);
        while(left <= right){

            int mid = left + (right-left)/2;
            // to prevent OverFlow. When simplified it will return the same as left + right /2

            if(arr[mid] >= arr[0]) {
                left = mid+1;
            } else if(arr[mid] < arr[0]) {
                pivot = mid;
                right = mid-1;
            }

            }
        System.out.println(pivot);
       return pivot;

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int pivot = SearchRoatatedArray(arr,5);
        System.out.println(pivot + "Hello");
    }

}
