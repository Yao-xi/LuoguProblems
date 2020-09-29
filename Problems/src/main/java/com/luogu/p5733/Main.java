package com.luogu.p5733;

/*
 * 大家都知道一些办公软件有自动将字母转换为大写的功能。
 * 输入一个长度不超过 100 且不包括空格的字符串。
 * 要求将该字符串中的所有小写字母变成大写字母并输出。
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println(str);
    }
}
