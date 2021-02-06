package com.luogu.p1000plus.p1571;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * input:
         *   4 3
         *   2 15 6 8
         *   8 9 2
         *
         * output:
         *   2 8
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        if ("0".equals(line1[0]) || "0".equals(line1[1])) {
            return;
        }
        String[] line2 = br.readLine().split(" ");
        String[] line3 = br.readLine().split(" ");
        
        List<String> stiAwardList = new ArrayList<>(Arrays.asList(line2));
        Set<String> scAwardList = new HashSet<>(Arrays.asList(line3));
        
        stiAwardList.retainAll(scAwardList);
        
        stiAwardList.forEach(o -> System.out.print(o + " "));
        
    }
}
