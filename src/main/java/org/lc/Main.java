package org.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("########################################################################################");
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(productOfArrayExceptSelf.solution1(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productOfArrayExceptSelf.solution2(new int[]{1, 2, 3, 4})));
        System.out.println("########################################################################################");

        System.out.println("########################################################################################");
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println("Valid Parentheses");
        System.out.println(validParentheses.solution("()"));
        System.out.println(validParentheses.solution("()[]{}"));
        System.out.println(validParentheses.solution("(]"));
        System.out.println(validParentheses.solution("([])"));
        System.out.println("########################################################################################");

        System.out.println("########################################################################################");
        System.out.println("Contains Duplicates");
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.solution(Arrays.asList(1,2,3,3)));
        System.out.println(containsDuplicate.solution(Arrays.asList(1,2,3,4)));
        System.out.println("########################################################################################");

    }
}