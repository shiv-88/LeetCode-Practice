package Stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackWMin {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);

        if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int removed = mainStack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top(){
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainStack.peek();

    }
}