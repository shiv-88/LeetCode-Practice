/*
package Matrices;

public class rowSum {

    public void printRowSum(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += A[i][j];
            }
            System.out.println(sum);

        }
    }



    public static void main(String[] args) {
        int[][] A = {{4,3,1,7},{2,5,8,6},{9,1,3,4},{1,1,2,3}};
        rowSum rs = new rowSum();
        rs.printRowSum(A);
    }


}
*/

package Matrices;

import java.util.Arrays;

public class rowSum {

    public int[] getRowSum(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        // Create an integer array to store the row sums
        int[] rowSum = new int[n]; //added

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += A[i][j];
            }

            // Store the row sum in the array ****** added
            rowSum[i] = sum;

        }

        // Return the array of row sums
        return rowSum; //added
    }

    public static void main(String[] args) {
        int[][] A = {{4,3,1,7},{2,5,8,6},{9,1,3,4},{1,1,2,3}};
        rowSum rs = new rowSum();

        // Call getRowSum method to get the array of row sums
        int[] rowSumArray = rs.getRowSum(A);

        // Print the array of row sums using Arrays.toString() method
        System.out.println(Arrays.toString(rowSumArray));
    }
}
