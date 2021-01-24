package com.leetcode.p674;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void test11() {
        int len = solution.findLengthOfLCIS(new int[]{});
        Assert.assertEquals(0, len);
    }
    
    @Test
    public void test12() {
        int len = solution.findLengthOfLCIS(new int[]{1});
        Assert.assertEquals(1, len);
    }
    
    @Test
    public void test02() {
        int len = solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        Assert.assertEquals(3, len);
    }
    
    @Test
    public void test03() {
        int len = solution.findLengthOfLCIS(new int[]{2, 2, 2});
        Assert.assertEquals(1, len);
    }
    
    @Test
    public void test04() {
        int len = solution.findLengthOfLCIS(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(5, len);
    }
    
    @Test
    public void test05() {
        int len = solution.findLengthOfLCIS(new int[]{1, 2});
        Assert.assertEquals(2, len);
    }
    
    @Test
    public void test06() {
        int len = solution.findLengthOfLCIS(new int[]{2, 1});
        Assert.assertEquals(1, len);
    }
    
    @Test
    public void test07() {
        int len = solution.findLengthOfLCIS(new int[]{2, 1, 2, 3});
        Assert.assertEquals(3, len);
    }
    
    @Test
    public void test08() {
        int len = solution.findLengthOfLCIS(new int[]{2, 1, 2, 2, 3});
        Assert.assertEquals(2, len);
    }
}