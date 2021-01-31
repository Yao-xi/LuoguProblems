package com.luogu.p4414;

/*
 * 您将获得三个整数A，B和C。
 * 数字将不按照确切的顺序给出，但我们确实知道A小于B，B小于C。
 * 想要按照给定的顺序重新排列它们。
 *
 * 输入格式
 * 第一行包含三个正整数A，B和C，不一定按此顺序。
 * 所有三个数字均小于或等于100。
 * 第二行包含三个大写字母“A”，“B”和“C”（它们之间没有空格），代表所需的顺序。
 *
 * 输出格式
 * 在一行中以所需顺序输出A，B和C，并以单个空格隔开。
 *
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = getIntArr(br.readLine().split(" "));
        
        String str = br.readLine();
        
        Arrays.sort(arr);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                System.out.print(arr[0]);
            } else if (str.charAt(i) == 'B') {
                System.out.print(arr[1]);
            } else if (str.charAt(i) == 'C') {
                System.out.print(arr[2]);
            }
            if (i != str.length() - 1) {
                System.out.print(" ");
            }
        }
    }
    
    public static int[] getIntArr(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
