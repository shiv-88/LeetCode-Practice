package StringManipulation;

public class StringPermunitions {

    public static void generatePermunitions(String input, int left, int right){
        if(left == right){
            System.out.println(input);
        }
        else{
            for(int i = left; i <= right; i++){
                input = swap(input, left, i);
                generatePermunitions(input, left+1, right);
                input = swap(input, left, i);
            }
        }
    }

    public static void printPermutations(String input){
        generatePermunitions(input,0,input.length() - 1);
    }

    public static String swap(String input, int i, int j){
        char[] chars = input.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutation of \"" + input + "\":");
        printPermutations(input);
    }
}
