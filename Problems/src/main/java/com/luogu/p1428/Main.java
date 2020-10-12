package com.luogu.p1428;

/*
 * 参赛的鱼被从左到右排成一排，头都朝向左边，然后每只鱼会得到一个整数数值，表示这只鱼的可爱程度，
 * 很显然整数越大，表示这只鱼越可爱，而且任意两只鱼的可爱程度可能一样。
 * 由于所有的鱼头都朝向左边，所以每只鱼只能看见在它左边的鱼的可爱程度，
 * 它们心里都在计算，在自己的眼力范围内有多少只鱼不如自己可爱呢。
 * 请你帮这些可爱但是鱼脑不够用的小鱼们计算一下。
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[i] > arr1[j]) {
                    arr2[i]++;
                }
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
