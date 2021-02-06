package com.luogu.p1000plus.p1047;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 由于马路上有一些区域要用来建地铁。
 * 这些区域用它们在数轴上的起始点和终止点表示。
 * 已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。
 * 现在要把这些区域中的树（包括区域端点处的两棵树）移走。
 * 你的任务是计算将这些树都移走后，马路上还有多少棵树。
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();   // 150 100 470 1 3
        ArrayList<Integer> list2 = new ArrayList<>();   // 300 200 471 2 4
        inputList(sc, m, list1, list2);
        // 去除重合 TODO
        for (int i = 0; i < list1.size(); i++) {
            int a = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                if (a > list1.get(j) && a < list2.get(j)) {
                    list1.set(i, list1.get(j));
                    list1.remove(j);
                    list2.remove(j);
                    j--;
                    i--;
                }
            }
        }
        
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
    
    private static void inputList(Scanner sc, int m, ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //for (int i = 0; i < m; i++) {
        //    list1.add(sc.nextInt());
        //    list2.add(sc.nextInt());
        //}
        for (int i = 0; i < m; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
    }
}
