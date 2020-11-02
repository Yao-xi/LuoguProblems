package com.luogu.p3370;

/*
 * 给定 N 个字符串（第 i 个字符串长度为 Mi 字符串内包含数字、大小写字母，大小写敏感）
 * 请求出 N 个字符串中共有多少个不同的字符串。
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int n = Integer.parseInt(num);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        System.out.println(set.size());
    }
}
