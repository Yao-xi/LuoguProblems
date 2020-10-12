package com.luogu.p1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 0;
        double sum = 0;
        
        while (k >= sum) {
            n++;
            sum += 1.0 / n;
        }
        
        System.out.println(n);
    }
}
