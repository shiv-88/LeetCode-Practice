package recursion;

public class NQueens {
    public static void printPermutation(String str, int idx, String perm) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        // Recursive Case
        //How does this work?
        //We are iterating through the string and removing the character at the current index and adding it to the permutation.
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, idx + 1, perm + currChar);
        }
    }

                public static void main(String args[]) {
                    String str = "ABC";
                    printPermutation(str, 0, "");

                }
}
