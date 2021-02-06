package com.luogu.p1000plus.p1739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * input:
         *  2*(x+y)/(1-x)@
         *
         * output:
         *  YES
         * */
        
        // 输入处理
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        
        String result = checkBracketMatching2(expression);
        System.out.println(result);
    }
    
    private static String checkBracketMatching(String expression) {
        // 用栈检查是否匹配括号
        Stack<Character> stack = new Stack<Character>();
        // 遍历字符串
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }
        if (stack.size() > 0) {
            return "NO";
        }
        return "YES";
    }
    private static String checkBracketMatching2(String expression) {
        // 使用计数器
        int count = 0;
        // 遍历字符串
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                count++;
            }
            if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return "NO";
                }
            }
        }
        if (count > 0) {
            return "NO";
        }
        return "YES";
    }
}
