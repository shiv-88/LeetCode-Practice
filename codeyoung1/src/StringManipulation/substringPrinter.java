package StringManipulation;

public class substringPrinter {

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsequences of \"" + input + "\":");
        printSubsequences(input);
    }

    public static void printSubsequences(String input) {
        printSubsequencesHelper(input, "");
    }

    private static void printSubsequencesHelper(String input, String current) {
        // Base case: when input becomes empty, print the current subsequence
        if (input.isEmpty()) {
            System.out.println(current);
            return;
        }

        // Include the first character and recurse with the remaining characters
        printSubsequencesHelper(input.substring(1), current + input.charAt(0));

        // Exclude the first character and recurse with the remaining characters
        printSubsequencesHelper(input.substring(1), current);
    }
}
