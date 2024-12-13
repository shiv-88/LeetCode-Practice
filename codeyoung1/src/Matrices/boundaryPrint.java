package Matrices;

public class boundaryPrint {

    public static void boundaryPrint(int[][] mat){

        int n = mat.length;

        for(int j = 0; j < n; j++){ //top row
            System.out.print(mat[0][j] + " ");
        }

        for (int i = 1; i < n; i++){ //right column
            System.out.print(mat[i][n-1]+" ");
        }

        for (int j = n - 2; j >= 0; j--){ //bottom row
            System.out.print(mat[n-1][j] + " ");

        }

        for (int i = n-2; i > 0; i--){ //left column
            System.out.print(mat[i][0] + " ");
        }


    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}, {16,17,18,19,20},{21,22,23,24,25}};
        boundaryPrint(A);
    }




}
