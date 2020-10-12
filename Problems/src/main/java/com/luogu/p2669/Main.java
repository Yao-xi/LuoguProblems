package com.luogu.p2669;

/*
 * 国王将金币作为工资，发放给忠诚的骑士。
 * 第一天，骑士收到一枚金币；
 * 之后两天（第二天和第三天），每天收到两枚金币；
 * 之后三天（第四、五、六天），每天收到三枚金币；
 * 之后四天（第七、八、九、十天），每天收到四枚金币……；
 * 这种工资发放模式会一直这样延续下去：当连续N天每天收到N枚金币后，
 * 骑士会在之后的连续N+1天里，每天收到N+1枚金币。
 *
 * 请计算在前K天里，骑士一共获得了多少金币。
 * */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        int a = 0;
        for (int i = 1; i <= k; ) {
            a++;
            for (int j = 0; j < a; j++) {
                sum += a;
                i++;
                if (i > k) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
