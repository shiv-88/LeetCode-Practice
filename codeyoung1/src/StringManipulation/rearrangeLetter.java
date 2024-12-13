package StringManipulation;

public class rearrangeLetter {

    /*
    To rearrange ABC, into BCA, CAB, etc.
BACKTRACKING N QUEENS PROBLEM
     */
    public static void rearrange(String str, String perm, int idx){
        if (str.length() == 0){
            System.out.println(perm);
            return;
        }

        for (int i = 0 ; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            //print rearrange(newStr, perm + currChar, idx+1);
            rearrange(newStr, perm + currChar, idx+1);

        }
    }

    public static void main(String args[]){
        String str = "ABC";
        rearrange(str, "", 0);
    }
}
