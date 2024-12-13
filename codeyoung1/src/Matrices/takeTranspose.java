package Matrices;

public class takeTranspose {

    public void takeTrans(int [][] matrix){


       int N = matrix.length;
       int M = matrix[0].length;

       int [][] transpose = new int[M][N];

        for (int i = 0; i < M; i++){
            for (int j = 0; j<N; j++){
            transpose[i][j] = matrix [j][i];
            }
        }

        for (int i = 0; i < M; i++){
            for (int j = 0; j<N; j++){
            System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4,5,6},{7,8,9,10,11,12}};
        takeTranspose ts = new takeTranspose();
        ts.takeTrans(A);
    }

}
