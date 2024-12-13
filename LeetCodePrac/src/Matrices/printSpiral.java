package Matrices;

public class printSpiral {

    public static void printSpiral(int[][] matrix){

        int n = matrix.length;

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;

        while(top <= bottom && left <= right){

            /*
            print top row , increment top
            print right column , deincrement right
            print bottom row , deincrement bottom
            print left column, increment left
             */

            //top and right column
            for (int j = left; j <= right; j++){
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            //bottom and left column

            if (top <= bottom){ //bottom
                for (int j = right; j >= left; j--){
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right){ //left * ++

                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;

            }


        }
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        /*
        1  2  3  4
        5  6  7  8
        9 10 11 12
        13 14 15 16
         */

        printSpiral(A);
    }
}
