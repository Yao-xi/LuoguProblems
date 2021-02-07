package com.leetcode.challenge2021.february.week1.p821;
//Given a string s and a character c that occurs in s, return an array of intege
//rs answer where answer.length == s.length and answer[i] is the shortest distance
// from s[i] to the character c in s. 
//
// 
// Example 1: 
// Input: s = "loveleetcode", c = "e"
//Output: [3,2,1,0,1,0,0,1,2,2,1,0]
// Example 2: 
// Input: s = "aaab", c = "b"
//Output: [3,2,1,0]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s[i] and c are lowercase English letters. 
// c occurs at least once in s. 
// 
// 👍 1331 👎 89


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortestDistanceToCharacter {
    
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
        String s = "loveleetcode";
        char c = 'e';
        int[] arr = solution.shortestToChar(s, c);
        int[] expected = new int[]{3,2,1,0,1,0,0,1,2,2,1,0};
        Assert.assertArrayEquals(expected, arr);
    }
    
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shortestToChar(String s, char c) {
        //  Input: s = "loveleetcode", c = "e"
        // Output: [3,2,1,0,1,0,0,1,2,2,1,0]
        
        // pos初始化设置一个极小的最小值
        // 第一次遍历的时候不知道字符c的位置计算后的距离应该是个极大的值
        int pos = -s.length();
        int[] res = new int[s.length()];
        
        // 从左向右遍历 记录上一个字符c 出现的位置pos 即 i-pos
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            res[i] = i - pos;
        }
        
        // 从右向左遍历 记录上一个字符c 出现的位置pos 即 pos-i
        for (int i = pos - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            // 两个值取最小
            res[i] = Math.min(res[i], pos - i);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)