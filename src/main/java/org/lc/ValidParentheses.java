package org.lc;

import java.util.Stack;

public class ValidParentheses {
    // Best Solution - Time O(N) - Space is O(N)
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(' && !stack.isEmpty() ) {
                stack.pop();
            } else if  (c == '}' && stack.peek() == '{'&& !stack.isEmpty()) {
                stack.pop();
            } else if  (c == ']' && stack.peek() == '[' && !stack.isEmpty()) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
