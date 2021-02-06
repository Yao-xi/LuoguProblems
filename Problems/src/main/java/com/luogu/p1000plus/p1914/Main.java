package com.luogu.p1000plus.p1914;

/*
 * 密码是由一个字符串组成。
 * 密码是由原文字符串（由不超过 50 个小写字母组成）中
 * 每个字母向后移动 n 位形成的。
 * z 的下一个字母是 a，如此循环。
 * 现在找到了移动前的原文字符串及 n，请你求出密码。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String oldStr = sc.next();
        char[] oldChars = oldStr.toCharArray();
        for (int i = 0; i < oldChars.length; i++) {
            oldChars[i] += n % 26;
            if (oldChars[i] > 'z') {
                oldChars[i] = (char) (oldChars[i] - 'z' - 1 + 'a');
            }
        }
        
        for (char oldChar : oldChars) {
            System.out.print(oldChar);
        }
    }
}
