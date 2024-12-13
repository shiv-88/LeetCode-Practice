package recursion;

//Place Tiles of size 1*m in a floor of size n*m. n=4, m=2.
public class TilePlacement {

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int m = 2; // Number of columns

        // Create the floor
        int[][] floor = new int[n][m];

        // Place tiles on the floor
        placeTiles(floor, m);

        // Display the floor
        displayFloor(floor);
    }

    private static void placeTiles(int[][] floor, int m) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                // Place tiles of size 1*m on the floor
                floor[i][j] = i;
            }
        }
    }

    private static void displayFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                System.out.print(floor[i][j] + " ");
            }
            System.out.println();
        }
    }
}