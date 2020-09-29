package com.luogu.p5716;

/*
 * 输入年份和月份，输出这一年的这一月有多少天。需要考虑闰年。
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int year = Integer.parseInt(st.nextToken()),
            month = Integer.parseInt(st.nextToken()),
            days = 0;
        //是否是闰年
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0))
                             || (year % 400 == 0);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 30;
                break;
        }
        if (isLeapYear && month == 2) {
            days++;
        }
        
        System.out.println(days);
    }
}
