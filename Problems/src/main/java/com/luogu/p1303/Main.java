package com.luogu.p1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal num1 = new BigDecimal(br.readLine());
        BigDecimal num2 = new BigDecimal(br.readLine());
        System.out.println(num1.multiply(num2));
    }
}
