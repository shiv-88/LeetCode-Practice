package Stacks;
import java.util.Stack;
public class RemoveConsecutivePairs {



    public static String solve(String A){

        Stack<Character> st = new Stack<>();

        if (A.length() == 1){
            return A;
        }

        st.push(A.charAt(0)); ////

        for (int i = 1; i < A.length(); i++){

            if(st.isEmpty()){
                st.push(A.charAt(i));
            }

            else if(!st.peek().equals(A.charAt(i))){
                st.push(A.charAt(i));
                }
            else{
                st.pop();
            }


        }

    StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args){

        System.out.println(solve("abckkcbam"));

    }

}
