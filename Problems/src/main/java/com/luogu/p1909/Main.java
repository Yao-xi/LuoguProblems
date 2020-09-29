package com.luogu.p1909;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 需要的铅笔数量
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int min;
        
        if (n % arr[0][0] != 0) {
            min = arr[0][1] * (n / arr[0][0] + 1);
        } else {
            min = arr[0][1] * (n / arr[0][0]);
        }
        
        if (n % arr[1][0] != 0) {
            min = Math.min(min, arr[1][1] * (n / arr[1][0] + 1));
        } else {
            min = Math.min(min, arr[1][1] * (n / arr[1][0]));
        }
        if (n % arr[2][0] != 0) {
            min = Math.min(min, arr[2][1] * (n / arr[2][0] + 1));
        } else {
            min = Math.min(min, arr[2][1] * (n / arr[2][0]));
        }
        
        System.out.println(min);
    }
}
