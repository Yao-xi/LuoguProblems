package com.luogu.p5717;

/*
 * 给出三条线段 a,b,c 的长度，均是不大于 10000 的整数。
 * 打算把这三条线段拼成一个三角形，它可以是什么三角形呢？
 *
 * 如果三条线段不能组成一个三角形，输出Not triangle；
 * 如果是直角三角形，输出Right triangle；
 * 如果是锐角三角形，输出Acute triangle；
 * 如果是钝角三角形，输出Obtuse triangle；
 * 如果是等腰三角形，输出Isosceles triangle；
 * 如果是等边三角形，输出Equilateral triangle。
 * 如果这个三角形符合以上多个条件，请分别输出，并用换行符隔开。
 *
 * a+b>c构成三角形
 *
 * 当两短边的平方和大于一长边的平方，说明是锐角三角形。
 * 当两短边的平方和等于一长边的平方，说明是直角三角形。
 * 当两短边的平方和小于一长边的平方，说明是钝角三角形。
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 升序 (0<=1<=2)
        
        // 三角形判断
        if (arr[0] + arr[1] <= arr[2]) {
            System.out.println("Not triangle");
            return;
        }
        // 角类型判断
        int a = arr[0] * arr[0] + arr[1] * arr[1]; // 两短边平方和
        int b = arr[2] * arr[2]; // 长边的平方
        if (a > b) {
            System.out.println("Acute triangle");
        } else if (a < b) {
            System.out.println("Obtuse triangle");
        } else {
            System.out.println("Right triangle");
        }
        // 等腰判断 (由于数组已排序,所以条件可以适当省去)
        if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println("Isosceles triangle");
            if (arr[0] == arr[2]) {
                System.out.println("Equilateral triangle");
            }
        }
    }
}
