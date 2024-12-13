package StringManipulation;

public class SubstringReverse {

    public static String reverseSubstring(String s, int start, int end){

        char[] chars = s.toCharArray();

        while (start < end){

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;

        }
        return new String(chars);
    }

    public static void main(String[] args){

        String s = "Hello World";
        System.out.println(reverseSubstring(s, 3, 8));

    }
}

/*




 */

