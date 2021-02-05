package com.leetcode.p122;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @Test
    public void test01() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int i = solution.maxProfit(prices);
        Assert.assertEquals(7, i);
    }
}