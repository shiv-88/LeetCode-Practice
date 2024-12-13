package StringManipulation;

import java.util.HashSet;

public class UniqueSubStrings {
/*
    public static void printUnique(String input, int index, String current, HashSet<String> uniqueSubs) {
        // Add the current subsequence to the set if it's not empty
        if (!current.isEmpty()) {
            uniqueSubs.add(current);
        }

        // Base case: when index reaches the end of the string, return
        if (index >= input.length()) {
            return;
        }

        // Include the character at the current index and recurse with the remaining characters
        printUnique(input, index + 1, current + input.charAt(index), uniqueSubs);

        // Exclude the character at the current index and recurse with the remaining characters
        printUnique(input, index + 1, current, uniqueSubs);
    }

    public static void printUniqueHelper(String input) {
        HashSet<String> uniqueSubseq = new HashSet<>();
        printUnique(input, 0, "", uniqueSubseq);

        // Print the unique subsequences
        for (String sub : uniqueSubseq) {
            System.out.println(sub);
        }
    }

 public static void main(String[] args) {
        String input = "aaa";
        printUniqueHelper(input);
    }

*/


//Question = Print Keypad Combination.(Nokia Keypad). "23"


        public static void main(String[] args) {
            String input = "aaa";
            printUniqueSubsequences(input);
        }

        public static void printUniqueSubsequences(String input) {
            HashSet<String> set = new HashSet<>();
            generateSubsequences(input, 0, "", set);

            System.out.println("Unique Subsequences:");
            for (String subsequence : set) {
                System.out.println(subsequence);
            }
        }

        private static void generateSubsequences(String input, int index, String current, HashSet<String> set) {
            if (index == input.length()) {
                set.add(current);
                return;
            }

            // Include the current character
            generateSubsequences(input, index + 1, current + input.charAt(index), set);

            // Exclude the current character
            generateSubsequences(input, index + 1, current, set);
        }
    }


