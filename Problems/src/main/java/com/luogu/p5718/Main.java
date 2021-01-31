package com.luogu.p5718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = getIntArr(br.readLine().split(" "));
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        System.out.println(min);
    }
    
    public static int[] getIntArr(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
}
