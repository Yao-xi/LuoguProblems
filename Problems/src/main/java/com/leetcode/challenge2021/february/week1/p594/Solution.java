package com.leetcode.challenge2021.february.week1.p594;
//We define a harmonious array as an array where the difference between its maxi
//mum value and its minimum value is exactly 1. 
//
// Given an integer array nums, return the length of its longest harmonious subs
//equence among all its possible subsequences. 
//
// A subsequence of array is a sequence that can be derived from the array by de
//leting some or no elements without changing the order of the remaining elements.
// 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,3,2,2,5,2,3,7]
//Output: 5
//Explanation: The longest harmonious subsequence is [3,2,2,2,3].
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4]
//Output: 2
// 
//
// Example 3: 
//
// 
//Input: nums = [1,1,1,1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 104 
// -109 <= nums[i] <= 109 
// 
// Related Topics Hash Table 
// 👍 1001 👎 106


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        //Input: nums = [1,3,2,2,5,2,3,7]
        //Output: 5
        //Explanation: The longest harmonious subsequence is [3,2,2,2,3].
        // 数组最大值与最小值之差=1 求最长的长度
        // 使用map集合 建立数字和个数的映射 所求的数组长度即为当前数字个数和当前数字+1的个数的和
        
        int len = 0;
        // 建立数字和个数的映射
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 遍历map
        for (Integer num : map.keySet()) {
            int key = num + 1;
            if (map.containsKey(key)) {
                Integer count1 = map.get(num);
                Integer count2 = map.get(key);
                len = Math.max(len, count1 + count2);
            }
        }
        
        return len;
    }
}
//leetcode submit region end(Prohibit modification and deletion)