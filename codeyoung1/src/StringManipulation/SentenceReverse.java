package StringManipulation;


    /*
    public static String reverseSentence(String sentence) {


        String[] words = sentence.split(" ");
        String ans = "";

        for (int i = words.length - 1; i >=0 ; i--){

            ans += words[i];

            if (i != 0){
                ans += " ";
            }

        }

    return ans;
    }
    */

    public class SentenceReverse {

        public static String reverseSubstring(String s) {
            String[] words = s.split(" ");

            int start = 0;
            int end = s.length() - 1;

            while (start < end) {
                String temp = words[start];
                words[start] = words[end];
                words[end] = temp;

                start++;
                end--;
            }

            return String.join(" ", words);
        }


        public static void main(String[] args) {
            String s = "This is a program";

            String reversedSubstring = reverseSubstring(s);
            System.out.println(reversedSubstring);
        }


    }
