package com.leetcode.p674;

public class Solution {
    /*
     * 0 <= nums.length <= 10^4
     * -10^9 <= nums[i] <= 10^9
     * */
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        //1.特殊处理
        // 1.1 空数组返回 0 只有一个元素返回 1
        if (nums.length <= 1) {
            return nums.length;
        }
        
        //2.双指针(i,j)遍历数组
        // 2.1 i遍历 j遍历i后面的
        for (int i = 0, j = i + 1; j < nums.length; j++) {
            // 2.3 比较[j-1]和[j]
            if (nums[j - 1] >= nums[j]) {
                //  2.3.2 当[i]>=[j]时 记录长度len i=j
                // maxLen = Math.max(maxLen, j - i + 1);
                maxLen = Math.max(maxLen, j - i);
                i = j;
            } else if (j == nums.length - 1) {
                // j遍历完成
                maxLen = Math.max(maxLen, j - i + 1);
            }
            //  2.3.1 当[j - 1]<[j]时 j++
        }
        
        //3.遍历完成返回最大len
        return maxLen;
    }
}
