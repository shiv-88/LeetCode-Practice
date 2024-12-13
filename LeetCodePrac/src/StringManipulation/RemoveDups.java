package StringManipulation;

public class RemoveDups {

    //Question 6 = Remove duplicates in a string. "abbccda"
    //HW Question 7 = Print all unique subsequences of a string. "abc"

    public static String removeDups(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the character is not visited, append it to the result and mark it as visited
            if (!visited[currentChar]) {
                result.append(currentChar);
                visited[currentChar] = true;
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String str = "abbccda";
        System.out.println(removeDups(str));
    }

}