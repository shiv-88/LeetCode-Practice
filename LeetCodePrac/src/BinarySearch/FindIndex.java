package BinarySearch;

public class FindIndex {

    public static int findIndex(int[] arr, int target){

        int s = 0;
        int e = arr.length - 1;
        int result = arr.length;
        //int n = arr.length;

        /*
        if (target > arr[n-1]){
            return n;
        }

        if (target < arr[0]){
            return 0;
        }
        */
        while (s<=e){

            int mid = (s+e)/2;

            if (arr[mid] == target){
                return mid;
            }

            else if (arr[mid] < target){
                //e = mid - 1;
                s = mid + 1;
            }

            else{
                result = mid;
               e = mid - 1;
            }

        }
        return result;
    }


    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        int target = 0;
        int result = findIndex(arr, target);
        System.out.println(result);
    }
}
