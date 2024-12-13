package recursion;

public class isPalindrome {

    public static boolean isPalin(String a){


        //Base case; string of len 0 or 1 is a palindrome

        if (a.length() == 0 || a.length() == 1) {return true;}

        //Main Logic; check if first and last characters match,
        // then recursive check the substring between until substring
        //is at length 0 or 1

        if (a.charAt(0) == a.charAt(a.length() - 1)){
            return isPalin(a.substring(1, a.length() - 1));

            // isPalin(a.substring(1), a.length - 2); ????? is this right
        }

        else return false;
    }

    public static void main(String[] args){
        String a = "racecar";
        String b = "brock";
        System.out.println(isPalin(a));
        System.out.println(isPalin(b));
    }
}

//to find O(N), currently O(N^2)