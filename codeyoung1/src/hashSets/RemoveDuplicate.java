package hashSets;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    //HOMEWORK: Print all the subsequence of a sub string.("abc")
        public static String removeDuplicates(String input) {

        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (uniqueChars.add(ch)) {

                resultBuilder.append(ch);
            }
        }


        return resultBuilder.toString();
    }
    public static void main(String[] args) {
        String input = "abbccda";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}

