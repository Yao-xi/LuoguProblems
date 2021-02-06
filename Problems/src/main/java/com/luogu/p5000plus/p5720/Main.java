package com.luogu.p5000plus.p5720;

/*
 * 一尺之棰，日取其半，万世不竭
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = Integer.toBinaryString(a);
        System.out.println(s.length());
        // int count = 1;
        // while (a > 1) {
        //     a = a >> 1;
        //     count++;
        // }
        // System.out.println(count);
    }
}
