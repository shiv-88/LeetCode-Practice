package Sorting;
import java.util.Arrays;
public class ConsecutiveCheck {

    /*
    TODO: Find if the array is Consecutive or not.
    Restraints: O(1) Space complexity.

    Possible method: Sort the array and find consecutive elements. Using the in built sort method may work
    Other possible ways? possible but too much work.

     order of working: sort in ascending order, then check if consecutive (how to find if consecutive?)
     */

    public static boolean elementsConsecutive(int[] arr){

        int n = arr.length;

        //Sort array
        Arrays.sort(arr);

        //consecutive check
        for (int i = 1; i < n; i++){

            // If the difference between adjacent elements is not 1, the elements are not consecutive
            if (arr[i] - arr[i - 1] != 1) {
                return false;
            }
        }

        return true;

    }
}
