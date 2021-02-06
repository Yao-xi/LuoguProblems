package com.luogu.p5000plus.p5739;

/*
 * 求阶乘
 * 挑战：尝试不使用循环语句（for、while）完成这个任务。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
    }
    
    public static int getFactorial(int n) {
        return n == 1 ? 1 : n * getFactorial(n - 1);
    }
}
