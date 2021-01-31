package com.luogu.p1177;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = getIntArr(br.readLine().split(" "));
        Arrays.sort(arr);
        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    
    private static int[] getIntArr(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
    
    private static void quickSort(int[] array, int start, int end) {
        // 用栈存储范围的索引
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        stack.push(end);
        int key;
        while (!stack.isEmpty()) {
            // 设置范围 并把索引弹栈
            int _end = stack.pop();
            int _start = stack.pop();
            // 计算基准数
            key = array[_start];
            // 设置双指针
            int left = _start;
            int right = _end;
            // 基准数排序
            while (left < right) {
                // 从右开始找比基准数小的
                while (array[right] >= key && left < right) {
                    right--;
                }
                // 从左开始找比基准数大的
                while (array[left] <= key && left < right) {
                    left++;
                }
                // 交换两个值的位置
                if (left < right) {
                    int temp1 = array[right];
                    array[right] = array[left];
                    array[left] = temp1;
                }
            }
            // 基准数归位
            if (key > array[left]) {
                int temp = array[_start];
                array[_start] = array[left];
                array[left] = temp;
            }
            // 索引成对压栈
            if (_start < left - 1) {
                stack.push(_start);
                stack.push(left - 1);
            }
            if (_end > left + 1) {
                stack.push(left + 1);
                stack.push(_end);
            }
        }
    }
}
