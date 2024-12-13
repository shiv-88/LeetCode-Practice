package StringManipulation;
import java.util.*;

public class KeypadNotation {
    // Mapping of numbers to their respective letters on a Nokia keypad
    private static final String[] KEYPAD_MAPPING = {
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    // Method to get all keypad combinations for a given number sequence
    public static List<String> getKeypadCombinations(String digits) {
        // Initialize an empty list to store combinations
        List<String> result = new ArrayList<>();
        // Check if the input string is null or empty
        if (digits == null || digits.length() == 0) {
            return result; // Return an empty list if the input is invalid
        }
        // Generate combinations starting from the first digit
        generateCombinations(digits, 0, "", result);
        // Return the list of combinations
        return result;
    }

    // Recursive method to generate keypad combinations
    private static void generateCombinations(String digits, int index, String current, List<String> result) {
        // Base case: If the current index equals the length of the number sequence
        if (index == digits.length()) {
            // Add the current combination to the result list
            result.add(current);
            // Return to exit the recursive call
            return;
        }

        // Get the current digit from the number sequence
        char digit = digits.charAt(index);
        // Get the corresponding letters for the current digit from the keypad mapping
        String letters = KEYPAD_MAPPING[digit - '0'];

        // For each letter corresponding to the current digit
        for (char letter : letters.toCharArray()) {
            // Generate combinations by including the current letter and moving to the next digit
            generateCombinations(digits, index + 1, current + letter, result);
        }
    }

    public static void main(String[] args) {
        // Initialize the input as "23"
        String input = "8";
        // Get all keypad combinations for the input
        List<String> combinations = getKeypadCombinations(input);

        // Print the combinations to the console
        System.out.println("Keypad Combinations for \"" + input + "\":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

}
