package com.luogu.p1000plus.p1217;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int n = 2;
        lo:
        while (n < b) {
            for (Integer integer : list) {
                if (n % integer == 0) {
                    n++;
                    continue lo;
                }
            }
            list.add(n);
            n++;
        }
        
        System.out.print("{");
        for (Integer integer : list) {
            System.out.print(integer + ",");
        }
        System.out.print("}");
        
        /*Iterator<Integer> iter = list.iterator();
        Integer next = iter.next();
        while (iter.hasNext()) {
            if (next >= a) {
                break;
            }
            next = iter.next();
        }
        do {
            if (isLoop(next)) {
                System.out.println(next);
            }
            next = iter.next();
        } while (iter.hasNext());*/
    }
    
    public static boolean isLoop(int a) {
        String str = String.valueOf(a);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
