package org.lc;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
//        System.out.println(Arrays.toString(productOfArrayExceptSelf.solution1(new int[]{1, 2, 3, 4})));
//        System.out.println(Arrays.toString(productOfArrayExceptSelf.solution2(new int[]{1, 2, 3, 4})));

        ValidParentheses validParentheses = new ValidParentheses();
//        System.out.println(validParentheses.solution("()"));
//        System.out.println(validParentheses.solution("()[]{}"));
        System.out.println(validParentheses.solution("(]"));
//        System.out.println(validParentheses.solution("([])"));
    }
}