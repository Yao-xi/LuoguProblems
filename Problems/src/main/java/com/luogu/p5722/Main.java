package com.luogu.p5722;

/*
 * 计算 1+2+3+⋯+(n−1)+n 的值，其中正整数 n 不大于 100。
 * 由于你没有高斯聪明，所以你不被允许使用等差数列求和公式直接求出答案。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(getSum(i));
    }
    
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }
}
