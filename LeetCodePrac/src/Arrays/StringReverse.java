package Arrays;

public class StringReverse {

    //String explainantion in next session
    public static String reverseString(String sentence){

        String[] n = sentence.trim().split(" ");
        //["the" , "sky" , "is" , "blue"]

        StringBuilder reverse = new StringBuilder();
        for (int i = n.length - 1; i > 0; i--){

            if(n[i] == "") {
                continue;
            }
            reverse.append(n[i] + " ");
        }

        reverse.append(n[0]);

        return reverse.toString();
    }


    public static void main(String[] args){

        /*
        String inp1 = "The Sky is blue";
        String inp2 = " Java Cool ";

        String res1 = reverseString(inp1);
        String res2 = reverseString(inp2);

        System.out.println(res1);
        System.out.println(res2);
        */
        System.out.println(reverseString("a good  example"));

    }
}
