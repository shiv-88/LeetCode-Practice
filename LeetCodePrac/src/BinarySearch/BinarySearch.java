package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                //go to the left
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

}
