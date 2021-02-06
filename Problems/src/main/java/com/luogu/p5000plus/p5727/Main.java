package com.luogu.p5000plus.p5727;

/*
 * 给出一个正整数 n (n<=100)，然后对这个数字一直进行下面的操作：
 * 如果这个数字是奇数，那么将其乘 3 再加 1，否则除以 2。
 * 经过若干次循环后，最终都会回到 1。经过验证很大的数字(7e11)
 * 都可以按照这样的方式比变成 1，所以被称为“冰雹猜想”。
 * 例如当 n 是 20，变化的过程是 [20, 10, 5, 16, 8, 4, 2, 1]。
 *
 * 根据给定的数字，验证这个猜想，并从最后的 1 开始，倒序输出整个变化序列。
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n > 1) {
            list.add(n);
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
        }
        list.add(1);
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
