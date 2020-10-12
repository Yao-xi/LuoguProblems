package com.luogu.p1720;

import java.util.Scanner;

public class Main {
    static final double SQRT5 = Math.sqrt(5);
    static final double SQRT5ADD1DIV2 = (Math.sqrt(5) + 1) / 2;
    static final double SQRT5SUB1DIV2 = (Math.sqrt(5) - 1) / 2;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f", getResult(n));
    }
    
    private static double getResult(int n) {
        return (Math.pow(SQRT5ADD1DIV2, n) - Math.pow(SQRT5SUB1DIV2, n)) / SQRT5;
    }
}
