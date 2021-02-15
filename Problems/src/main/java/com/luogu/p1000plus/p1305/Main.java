package com.luogu.p1000plus.p1305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
     * input:
     *   6   --- 二叉树的节点数
     *   abc --- 节点值 左子树 右子树
     *   bdi
     *   cj* --- *为null
     *   d**
     *   i**
     *   j**
     * output: abdicj --- 前序遍历
     * */
    
    static char[][] arr = new char[26][3];
    static int n =0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            arr[i][0] = chars[0];
            arr[i][1] = chars[1];
            arr[i][2] = chars[2];
        }
        dfs(arr[0][0]);
    }
    
    // 暴力搜索
    private static void dfs(char c) {
        if (c != '*') {
            System.out.print(c);
            for (int i = 0; i < n; i++) {
                if (arr[i][0] == c) {
                    dfs(arr[i][1]); // 左
                    dfs(arr[i][2]); // 右
                }
            }
        }
    }
    
}