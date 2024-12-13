package BinarySearch;

/*
 Given a sorted ascending order array, find the frequency of an element which is only one.
A= 1,2,2,2,3,3,3,3,4,4,4,5,5
oneFreq() = 1
 */
public class OneFreq {

    public static int oneFreq(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // If arr[mid] occurs only once, return the element
            if ((mid == 0 || arr[mid - 1] != arr[mid]) && (mid == n - 1 || arr[mid + 1] != arr[mid])) {
                return arr[mid];
            }

            // If arr[mid] has a duplicate on the left side, adjust the search range
            if (mid > 0 && arr[mid - 1] == arr[mid]) {
                if ((mid - s) % 2 == 0) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
            // If arr[mid] has a duplicate on the right side, adjust the search range
            else if (mid < n - 1 && arr[mid + 1] == arr[mid]) {
                if ((e - mid) % 2 == 0) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // If neither side has a duplicate, return the element
            else {
                return arr[mid];
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5};
        int element = oneFreq(arr);
        System.out.println("Element occurring only once: " + element);
    }

}

