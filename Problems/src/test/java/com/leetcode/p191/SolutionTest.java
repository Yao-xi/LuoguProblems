package com.leetcode.p191;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void before() {
        solution = new Solution();
    }
    
    @Test
    public void hammingWeight1() {
        int count = solution.hammingWeight(0b00000000000000000000000000001011);
        Assert.assertEquals(3, count);
    }
    
    @Test
    public void hammingWeight2() {
        int count = solution.hammingWeight(0b11111111111111111111111111111101);
        Assert.assertEquals(31, count);
    }
}