package com.luogu.p5000plus.p5719;

/*
 * 给定 n(n≤10000) 和 k(k≤100)，
 * 将从 1 到 n 之间的所有正整数可以分为两类：
 * A 类数可以被 k 整除（也就是说是 k 的倍数），
 * 而 B 类数不能。请输出这两类数的平均数，
 * 精确到小数点后 1 位，用空格隔开。
 * 数据保证两类数的个数都不会是 0。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
            k = sc.nextInt();
        
        double sumA = 0, sumB = 0,
            countA = 0, countB = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                sumA += i;
                countA++;
            } else {
                sumB += i;
                countB++;
            }
        }
        
        System.out.printf("%.1f %.1f", sumA / countA, sumB / countB);
    }
}
