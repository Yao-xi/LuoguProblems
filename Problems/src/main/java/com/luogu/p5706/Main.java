package com.luogu.p5706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * input:
         *   500.0 3
         *
         * output:
         *   166.667
         *   6
         * */
        // 输入处理
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inArr = br.readLine().split(" ");
        // 总共多少毫升的水
        double all = Double.parseDouble(inArr[0]);
        // 多少人分
        int n = Integer.parseInt(inArr[1]);
        // 每人分多少
        double avg = all / n;
        System.out.printf("%.3f", avg);
        // 杯子数
        int numberOfCups = n * 2;
        System.out.println("\n" + numberOfCups);
    }
}
