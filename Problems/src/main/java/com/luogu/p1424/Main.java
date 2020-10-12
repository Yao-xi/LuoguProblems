package com.luogu.p1424;

/*
 * 有一只小鱼，它平日每天游泳 250 公里，周末休息（实行双休日)，
 * 假设从周x(1≤x≤7) 开始算起，过了n(n≤10^6)天以后，小鱼一共累计游泳了多少公里呢？
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (x != 6 && x != 7) {
                sum += 250;
            }
            x++;
            if (x > 7) {
                x = 1;
            }
        }
        System.out.println(sum);
    }
}
