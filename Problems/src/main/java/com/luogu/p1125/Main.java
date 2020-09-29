package com.luogu.p1125;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], 1);
            } else {
                Integer integer = map.get(chars[i]);
                map.put(chars[i], integer + 1);
            }
        }
        
        int max = 0, min = 100;
        for (int i : map.values()) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        
        int x = max - min;
        String s;
        if (x == 1 || x == 0) {
            s = "No Answer";
        } else {
            s = "Lucky Word";
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    s = "No Answer";
                    break;
                }
            }
        }
        
        System.out.println(s);
        if ("No Answer".equals(s)) {
            System.out.println(0);
        } else {
            System.out.println(x);
        }
    }
}
