package StringManipulation;
import java.util.*;

public class SameLetterUniqueSubstrings {
    //Question 8 = Print all unique subsequences of a string. "aaa"

    //hw: Question 9 = Print keypad combination.



        /*
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            //print rearrange(newStr, perm + currChar, idx+1);
            printUniqueSubstrings(newStr, perm + currChar, idx + 1);

        }

      */

    public static void printUniqueSubstrings(String input, String current, Set<String> result) {
        if (input.length() == 0) {
            result.add(current);
            return;
        }
            printUniqueSubstrings(input.substring(1), current + input.charAt(0), result);
            printUniqueSubstrings(input.substring(1), current, result);
    }


        public static void main(String[] args) {
            String input = "aaa";
            Set<String> result = new HashSet<>();
            printUniqueSubstrings(input, "", result);

            System.out.println("Unique Subsequences:");
            for (String subsequence : result) {
                System.out.println(subsequence);
            }
        }
}
