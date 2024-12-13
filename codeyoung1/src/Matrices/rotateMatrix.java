package Matrices;

public class rotateMatrix {

    public static void rotateMatrix(int[][] matrix){

        int n = matrix.length;

        //take transpose
        for(int i = 0; i<n ; i++){
            for (int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        //reverse rows
        for (int i = 0; i < n; i++){

            int left = 0;
            int right = n-1;

            while (left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

            }
        }


        public static void main (String[]args){

            int[][] A = {{1, 2, 3}, {4,5,6}, {7,8,9}};
            rotateMatrix(A);

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

