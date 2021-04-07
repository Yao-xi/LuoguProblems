package com.leetcode.challenge2021.april.p1704;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int countA=0;
        int countB=0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0,j=len-1; i < len / 2; i++,j--) {
            if (set.contains(s.charAt(i))) {
                countA++;
            }
            if (set.contains(s.charAt(j))) {
                countB++;
            }
        }
        return countA==countB;
    }
    
    public int result(String s, int l, int r, boolean[] arr, int count) {
        while(l < r){
            if(arr[s.charAt(l)-65]) count++;
            l++;
        }
        return count;
    }
    public boolean halvesAreAlike11(String s) {
        boolean arr[] = new boolean[58];
        arr['a'- 65] = arr['e'- 65] = arr['i'- 65] = arr['o'- 65] = arr['u'- 65] = arr['A'-65] = arr['E'-65] = arr['I'- 65] = arr['O'-65] = arr['U'-65] = true;
        return result(s, 0, s.length() / 2, arr, 0) == result(s, s.length() / 2, s.length(), arr, 0);
    }
}