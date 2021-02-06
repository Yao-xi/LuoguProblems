package com.luogu.p1000plus.p1116;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // input:
        // 4
        // 4 3 2 1
        // output:
        // 6
        
        // 1.输入处理
        // 输入流 的抽象类
        // System.in 控制台的输入流  1字节=8位的0和1  就是一个字节一个字节的去读取控制台的输入
        // Scanner 把控制台的输入流 封装成 Scanner的对象 提供了一堆好用的方法
        // Scanner 比较慢
        // 所以可以把控制台的输入流封装成 BufferedReader
        // 这个题数据有问题 用不了BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // br.readLine();
        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // 2.方法调用
        int count = getSwitchCount1(arr);
        // 3.打印结果
        System.out.println(count);
    }
    
    
    /**
     * 排序数组 获取数组排序过程中交换的次数
     * <p>
     * javadoc 文档注释
     *
     * @param arr
     *     待排序数组
     *
     * @return int 交换的次数
     */
    public static int getSwitchCount1(int[] arr) {
        int count = 0;
        // 冒泡排序算法
        for (int i = 0; i < arr.length - 1; i++) {
            // 循环次数优化
            // 比较次数 = arr.length-i-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // j 和 j+1 比较大小
                if (arr[j] > arr[j + 1]) {
                    // 交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // 交换次数+1
                    count++;
                }
            }
        }
        // 测试用
        // System.out.println(Arrays.toString(arr));
        return count;
    }
    
    public static void main1(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        Reader sc = new Reader();
        int len = sc.nextInt();// 数据长度
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = getSwitchCount(arr);
        System.out.println(count);
    }
    
    private static int getSwitchCount(int[] arr) {
        // 冒泡排序记录次数
        int count = 0;
        
        // 4 3 2 1
        // 3 4 2 1
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 交换
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    
                    count++;
                }
            }
        }
        
        return count;
    }
    
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        
        // public Reader(String file_name) throws IOException
        // {
        //     din = new DataInputStream(new FileInputStream(file_name));
        //     buffer = new byte[BUFFER_SIZE];
        //     bufferPointer = bytesRead = 0;
        // }
        
        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
        
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
        
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }
        
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
    }
}
