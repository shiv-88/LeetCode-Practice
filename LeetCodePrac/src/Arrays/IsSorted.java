package Arrays;

public class IsSorted {
    //to check if array is sorted in strictly inscreasing order.
    //TC: o(n)

    public static boolean isSorted(int[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr));

    }


}
