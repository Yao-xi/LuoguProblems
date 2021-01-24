package com.leetcode.p15;

import org.junit.Test;

import java.util.List;

public class SolutionTest {
    
    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = new Solution().threeSum(nums);
        System.out.println(lists);
    }
    
    @Test
    public void threeSum2() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> lists = new Solution().threeSum(nums);
        System.out.println(lists);
    }
}