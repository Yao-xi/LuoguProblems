package com.leetcode.p125;

public class Solution {
    public boolean isPalindrome(String s) {
        // 检查输入是否有效
        if (s == null) {
            return false;
        }
        if (s.length() <= 1) {
            return true;
        }
        // 去除特殊符号
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // 翻转字符串
        String s1 = new StringBuilder(s).reverse().toString();
        // 和原始比较
        if (s1.equalsIgnoreCase(s)) {
            return true;
        }
        return false;
    }
    
}
