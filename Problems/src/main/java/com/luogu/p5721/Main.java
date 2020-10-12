package com.luogu.p5721;

/*
 * 给出n(1≤n≤13)，请输出一个直角边长度是n的数字直角三角形。
 * 所有数字都是2位组成的，如果没有2位则加上前导0。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a < 10) {
                    System.out.print("0");
                }
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
