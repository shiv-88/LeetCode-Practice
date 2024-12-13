package Stacks;
import java.util.Stack;

public class BalanceParenthesis {
    public static int solve(String A) {
        Stack<Character> st = new Stack<>();
        char[] x = A.toCharArray();

        if (A.length() == 1) {
            return 0;
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == '{' || x[i] == '(' || x[i] == '[') {
                st.push(x[i]);
            } else {
                if (x[i] == '}') {
                    if (st.isEmpty() || st.peek() != '{') {
                        return 0;
                    } else {
                        st.pop();
                    }
                }
                if (x[i] == ')') {
                    if (st.isEmpty() || st.peek() != '(') {
                        return 0;
                    } else {
                        st.pop();
                    }
                }
                if (x[i] == ']') {
                    if (st.isEmpty() || st.peek() != '[') {
                        return 0;
                    } else {
                        st.pop();
                    }
                }
            }
        }

        if (st.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("{([])}")); // Output: 1
    }
}
