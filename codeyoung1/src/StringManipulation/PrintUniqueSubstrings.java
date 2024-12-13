package StringManipulation;

public class PrintUniqueSubstrings {

    //HW Question 7 = Print all unique subsequences of a string. "abc"

    public static void printUniqueSubstrings(String str, String perm, int idx) {

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            //print rearrange(newStr, perm + currChar, idx+1);
            printUniqueSubstrings(newStr, perm + currChar, idx + 1);

        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printUniqueSubstrings(str, "", 0);
    }


}
