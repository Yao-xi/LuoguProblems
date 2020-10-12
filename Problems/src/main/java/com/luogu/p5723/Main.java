package com.luogu.p5723;

/*
 * 质数口袋
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, a = 2;
        ArrayList<Integer> list = new ArrayList<>();
        lo:
        while (sum < n) {
            for (Integer integer : list) {
                if (a % integer == 0) {
                    a++;
                    continue lo;
                }
            }
            if (sum + a > n) {
                break;
            }
            list.add(a);
            sum += a;
            a++;
        }
        
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list.size());
    }
    
}
