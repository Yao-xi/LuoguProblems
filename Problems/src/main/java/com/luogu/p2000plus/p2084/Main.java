package com.luogu.p2000plus.p2084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * input:
         *  2 10101
         *
         * output:
         *  1*2^4+1*2^2+1*2^0
         * */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inArr = br.readLine().split(" ");
        int m = Integer.parseInt(inArr[0]);
        String number = inArr[1];
        
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c != '0') {
                s.append(c).append("*").append(m).append("^").append(number.length() - i - 1).append("+");
            }
        }
        if (s.length() > 1) {
            s.deleteCharAt(s.length() - 1);
        }
        System.out.println(s);
    }
}
