package com.leetcode.uncategorized.p191;

import com.leetcode.challenge2021.february.week1.p191.Solution;
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