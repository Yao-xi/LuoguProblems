package com.luogu.p5000plus.p5724;

/*
 * 极差的意思是一组数中的最大值减去最小值的差。
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}
