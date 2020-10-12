package com.luogu.p1888;

/*
 * 输入一组勾股数 a,b,c (a!=b!=c)
 * 用分数格式输出其较小锐角的正弦值。（要求约分。）
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 斜边
        int max = Math.max(Math.max(a, b), c);
        // 最短边
        int min = Math.min(Math.min(a, b), c);
        
        // 约分
        int gcd = getGreatestCommonDivisor(max, min);
        System.out.println((min / gcd) + "/" + (max / gcd));
    }
    
    /**
     * 辗转相除法求最大公约数
     * <p>
     * 以小数除大数，如果能整除，那么小数就是所求的最大公约数
     * 否则就用余数来除刚才的除数；再用这新除法的余数去除刚才的余数
     * 依此类推，直到一个除法能够整除，这时作为除数的数就是所求的最大公约数．
     */
    public static int getGreatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int i = max % min;
        int temp;
        while (i != 0) {
            temp = i;
            i = min % i;
            min = temp;
        }
        return min;
    }
}
