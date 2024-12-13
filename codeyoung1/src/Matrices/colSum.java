/*
package Matrices;

public class colSum {

public void printColSum(int [][] A){

    int n = A.length;
    int m = A[0].length;

    for (int j = 0; j < m; j++){
        int sum = 0;
                for (int i = 0; i < n; i++){
                    sum+= A[i][j] ;
                }
                System.out.println(sum);
    }

}

public static void main(String[] args){

    int[][] A =  {{4,3,1,7},{2,5,8,6},{9,1,3,4},{1,1,2,3}};
    colSum cs = new colSum();
    cs.printColSum(A);

}

}
*/

package Matrices;

import java.util.Arrays;
public class colSum {

    public int[] getColSum(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        // Create an integer array to store the column sums
        int[] colSum = new int[m];

        for (int j = 0; j < m; j++) {

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += A[i][j];
            }

            // Store the column sum in the array
            colSum[j] = sum;

        }

        // Return the array of column sums
        return colSum;
    }

    public static void main(String[] args) {
        int[][] A = {{4,3,1,7},{2,5,8,6},{9,1,3,4},{1,1,2,3}};
        colSum cs = new colSum();

        // Call getColSum method to get the array of column sums
        int[] colSumArray = cs.getColSum(A);

        // Print the array of column sums using Arrays.toString() method
        System.out.println(Arrays.toString(colSumArray));
    }
}
