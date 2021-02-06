package com.luogu.p5000plus.p5732;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printYHTriangle(n);
    }
    
    
    /**
     * 打印杨辉三角 使用不等长的二维数组实现
     */
    public static void printYHTriangle(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    // 给首尾赋值
                    arr[i][j] = 1;
                } else if (i >= 2) {
                    // 计算其他元素
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        
        print(arr);
    }
    
    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    System.out.print(anInt);
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
