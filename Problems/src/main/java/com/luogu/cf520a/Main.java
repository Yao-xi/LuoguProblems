package com.luogu.cf520a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * input:
         *   12
         *   toosmallword
         *
         * output:
         *   NO
         * */
        
        // 输入处理
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 字符串的长度
        br.readLine();
        // 输入字符串
        String s = br.readLine();
        
        // 转全大写
        char[] chars = s.toUpperCase().toCharArray();
        
        // 遍历添加到set集合中
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
