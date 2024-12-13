package Sorting;
import java.util.Arrays;

public class greaterThanP {

    //Using in built sorting method

    /*
    public static int findIntP(int[] arr) {

        int n = arr.length;

        //Step 1, Sort the array
        Arrays.sort(arr);
        //Step 2, Traverse the sorted array
        for(int i = 0; i < n; i++){ //greatest to smallest

            int p = arr[i]; //extract element at current index.
            int count = n - i - 1; //this calculates the number of integer than the element at current index
            //Subtract current element at current index from total number of elements, then subtracting 1.

            //cech if nymber of integers greater than p is equal to p
            if (count == p){
                return p;
            }
        }
        return -1; //if not found.
    }

     */

    public static int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && A[i] == A[i + 1]) {
                continue;
            }
            int count = n - i - 1;
            if (count == A[i]) {
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,2,1,3};
        int[] arr1 = {4,5,1,2,3,6}; //sorted = 1,2,3,4,5,6
        int result = solve(arr);
        int result2 = solve(arr1);
        System.out.println(result);
        System.out.println(result2);
    }

    /*
    DRY RUN:
        3,2,1,3
        sort = 1,2,3,3

        i = 3; p = arr[3] = 3; count = 4 - 3 - 1 = 0, therefor 3 has 0 elements greater than itself.
        i = 2; p = arr[2] = 3; count = 4 - 2  - 1 = 0, 3 has 1 elements greater than itself.

        This is false. Code invalid.



     */
}




