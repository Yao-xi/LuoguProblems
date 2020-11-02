package com.luogu.p1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal num = new BigDecimal(br.readLine());
        BigDecimal sum = new BigDecimal("1");
        while (!num.equals(BigDecimal.ONE)) {
            sum = sum.multiply(num).add(BigDecimal.ONE);
            num = num.subtract(BigDecimal.ONE);
        }
        System.out.println(sum);
    }
}
