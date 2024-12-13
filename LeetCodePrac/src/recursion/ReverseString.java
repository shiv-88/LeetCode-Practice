package recursion;

public class ReverseString {
    public static String reverseString(String input){
        return (input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);

        System.out.println(input);
        System.out.println(reversed);
    }
}
