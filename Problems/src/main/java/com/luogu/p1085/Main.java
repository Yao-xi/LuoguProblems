package com.luogu.p1085;

/*
 * 津津如果一天上课超过八个小时就会不高兴，而且上得越久就会越不高兴。
 * 假设津津不会因为其它事不高兴，并且她的不高兴不会持续到第二天。
 * 请你帮忙检查一下津津下周的日程安排，
 * 看看下周她会不会不高兴；如果会的话，哪天最不高兴。
 *
 * 输入格式
 * 输入包括7行数据，分别表示周一到周日的日程安排。
 * 每行包括两个小于10的非负整数，用空格隔开，
 * 分别表示津津在学校上课的时间和妈妈安排她上课的时间。
 *
 * 输出格式
 * 一个数字。如果不会不高兴则输出00，如果会则输出最不高兴的是周几（用1, 2, 3, 4, 5, 6, 7
 * 分别表示周一，周二，周三，周四，周五，周六，周日）。
 * 如果有两天或两天以上不高兴的程度相当，则输出时间最靠前的一天。
 * */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int[] b = new int[7];
        int[] notHappy = new int[7];
        for (int i = 0; i < notHappy.length; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            notHappy[i] = a[i] + b[i] - 8;
        }
        int maxIndex = 0;
        for (int i = 1; i < notHappy.length; i++) {
            maxIndex = notHappy[i] > notHappy[maxIndex] ? i : maxIndex;
        }
        System.out.println(maxIndex + 1);
    }
}
