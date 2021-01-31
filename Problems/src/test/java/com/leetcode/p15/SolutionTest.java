package com.leetcode.p15;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.List;

public class SolutionTest {
    
    @Rule
    public TestName name = new TestName();
    Solution solution = new Solution();
    private long startTime;
    
    @Before
    public void setUp() throws Exception {
        startTime = System.currentTimeMillis();
    }
    
    @After
    public void tearDown() throws Exception {
        long endTime = System.currentTimeMillis();
        System.out.println("TestFunction: " + name.getMethodName() + " , time: " + (endTime - startTime) + "ms");
    }
    
    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
    
    @Test
    public void threeSum2() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
}