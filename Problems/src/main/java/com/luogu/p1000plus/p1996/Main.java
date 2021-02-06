package com.luogu.p1000plus.p1996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // input: 10 3
        // output: 3 6 9 2 7 1 8 5 10 4
        
        // 1.输入处理
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] inputStrArr = inputStr.split(" ");
        int n = Integer.parseInt(inputStrArr[0]);
        int m = Integer.parseInt(inputStrArr[1]);
        // 2.方法调用
        String result = josephQuestion(n, m);
        // 3.打印结果
        System.out.println(result);
    }
    
    /**
     * @param n
     *     n个人围成一圈
     * @param m
     *     移除第m个人
     */
    public static String josephQuestion(int n, int m) {
        // Integer 是 int 的包装类
        // 现在把 Integer 当作 int 用就行
        
        // Queue 队列
        // 出队列 queue.poll();
        // 进队列 queue.add();
        Queue<Integer> queue = new LinkedList<>();
        // 把所有的数添加到队列中
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        
        // 计数器
        int count = 0;
        // 输出用的字符串
        // append 方法可以在后面拼接字符串
        StringBuilder sb = new StringBuilder();
        
        // 循环到队列中元素只剩一个
        while (queue.size() > 1) {
            // 开始从队列中移除头元素 poll
            Integer i = queue.poll();
            // 计数器++
            count++;
            // 计数器 == m 的话 则要打印该元素 并重置计数器
            if (count == m) {
                sb.append(i).append(" ");
                count = 0;
            } else {
                // 不满足条件 则 添加到队列尾部 add
                queue.add(i);
            }
        }
        sb.append(queue.poll());
        return sb.toString();
    }
    
    public static void main1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]),
            m = Integer.parseInt(str[1]);
        
        // 3
        // 1 2 3 4 5 6 7 8 9 10
        // 3 6 9 2 7 1 8 5 10 4
        
        // 100
        // 1 2 3 4 5
        
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.addLast(i);
        }
        
        // System.out.println(list);
        // 移动次数计数
        int count = 0;
        for (int i = 0; list.size() > 1; i++) {
            // System.out.println(" i = " + i);
            // System.out.println(list);
            // 指针归零
            if (i >= list.size()) {
                i = (i - list.size()) % m;
            }
            if (count == m - 1) {
                Integer r = list.remove(i);
                // System.out.println("remove list[" + i + "] = " + r);
                System.out.print(r + " ");
                count = 0;
            }
            count++;
        }
        System.out.print(list.remove(0));
    }
}
