package com.leetcode.challenge2021.february.week2;


//Given two strings s and t , write a function to determine if t is an anagram o
//f s.
//
// Example 1:
//
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//
//
// Example 2:
//
//
//Input: s = "rat", t = "car"
//Output: false
//
//
// Note:
//You may assume the string contains only lowercase alphabets.
//
// Follow up:
//What if the inputs contain unicode characters? How would you adapt your soluti
//on to such case?
// Related Topics Hash Table Sort
// 👍 2235 👎 158


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    
    Solution solution;
    
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    
    @Before
    public void before() {
        solution = new Solution();
    }
    
    @Test
    public void test01() {
        // Input: s = "anagram", t = "nagaram"
        //Output: true
        String s = "anagram", t = "nagaram";
        boolean anagram = solution.isAnagram(s, t);
        Assert.assertEquals(true,anagram);
    }
    @Test
    public void test02() {
        // Input: s = "rat", t = "car"
        //Output: true
        String s = "rat", t = "car";
        boolean anagram = solution.isAnagram(s, t);
        Assert.assertEquals(false,anagram);
    }
    
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = true;
        
        if (s.length() != t.length()) {
            return false;
        }
        
        // 用map存储字符和其出现的个数
        Map<Character, Integer> sMap = createCharacterIntegerMap(s);
        
        Map<Character, Integer> tMap = createCharacterIntegerMap(t);
        
        for (Character key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                res = false;
                break;
            }
        }
        
        return res;
    }
    
    private Map<Character, Integer> createCharacterIntegerMap(String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            Integer count = tMap.get(key);
            if (count == null) {
                count = 0;
            }
            tMap.put(key, ++count);
        }
        return tMap;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
