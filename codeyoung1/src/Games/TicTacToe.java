package Games;
import java.util.*;

public class TicTacToe {

    // The 3x3 Tic-Tac-Toe board
    private char[][] board;

    // Current player (X or O)
    private char currentPlayer;

    // Constructor initializes the board and sets the current player to X
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current state of the board
    private void printBoard() {
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    // Make a move at the specified row and column
    private boolean makeMove(int row, int col) {
        // Check if the move is within the board boundaries and the cell is empty
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            // Place the current player's symbol at the specified position
            board[row][col] = currentPlayer;
            return true; // Move successful
        }
        return false; // Move invalid
    }

    // Check if the current player has won
    private boolean checkWin() {
        // Check rows and columns for a winning combination
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true; // Winning row
            }
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true; // Winning column
            }
        }
        // Check diagonals for a winning combination
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true; // Winning diagonal (top-left to bottom-right)
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true; // Winning diagonal (top-right to bottom-left)
        }
        return false; // No winning combination found
    }

    // Check if the board is full
    private boolean boardIsFull() {
        // If any cell is empty, the board is not full
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // Board is not full
                }
            }
        }
        return true; // Board is full
    }

    // Switch players (X to O, or O to X)
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Play the Tic-Tac-Toe game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard(); // Display the current state of the board
            System.out.println("Player " + currentPlayer + ", enter your move (row and column separated by a space): ");
            System.out.println("Enter row (0-2) and column (0-2): ");
            int row = scanner.nextInt(); // Read row input from the player
            int col = scanner.nextInt(); // Read column input from the player

            // Attempt to make a move at the specified position
            if (makeMove(row, col)) {
                // Check if the current player has won
                if (checkWin()) {
                    printBoard(); // Display the final state of the board
                    System.out.println("Player " + currentPlayer + " wins!"); // Announce the winner
                    break; // End the game
                }
                // Check if the board is full (tie game)
                else if (boardIsFull()) {
                    printBoard(); // Display the final state of the board
                    System.out.println("It's a tie!"); // Announce a tie
                    break; // End the game
                }
                // If no winner and the board is not full, switch players
                else {
                    switchPlayer(); // Switch to the next player
                }
            }
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Main method to start the game
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create a new Tic-Tac-Toe game instance
        game.playGame(); // Start playing the game
    }
}
