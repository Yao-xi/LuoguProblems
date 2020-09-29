package com.luogu.p1055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.replace("-", "");
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int a = Character.getNumericValue(str.charAt(i));
            sum += a * (i + 1);
        }
        int code = sum % 11;
        String s1 = str.substring(str.length() - 1);
        String s2;
        if (code == 10) {
            s2 = "X";
        } else {
            s2 = String.valueOf(code);
        }
        if (s.substring(s.length() - 1).equals(s2)) {
            System.out.println("Right");
        } else {
            System.out.println(s.substring(0, s.length() - 1) + s2);
        }
        
    }
}
