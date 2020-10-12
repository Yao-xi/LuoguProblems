package com.luogu.p1427;

/*
 * 要求它把看到的一串数字长度不一定，以 0 结束）
 * 记住了然后反着念出来（表示结束的数字 0 就不要念出来了）
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
