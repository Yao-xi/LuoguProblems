package com.luogu.p1601;

/*
 * 高精度计算A+B
 * */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal bd1 = new BigDecimal(sc.nextLine());
        BigDecimal bd2 = new BigDecimal(sc.nextLine());
        System.out.println(bd1.add(bd2));
    }
}
