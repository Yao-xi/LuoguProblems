package com.luogu.p5720;

/*
 * 一尺之棰，日取其半，万世不竭
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        while (a != 1) {
            a /= 2;
            count++;
        }
        System.out.println(count);
    }
}
