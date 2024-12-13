package Matrices;

public class printDiag {

    public static void printDiagRL(int [][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;


        //print all diag in 0th row
        for(int j = 0; j == n; j++){
            int r = 0;
            int c = j;

            while (r < n && c >= 0){
                System.out.println(matrix[r][c]);

                r++;
                c--;
            }
        }

        //print all diag starting from last col

        for (int i = 0; i < m; i++){
            int r = i;
            int c = m-1;

            while (r < n && c >= 0){
                System.out.println(matrix[r][c]);
                r++;
                c--;
            }
        }

    }



}
