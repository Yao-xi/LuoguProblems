package com.leetcode.uncategorized.p26;

import com.leetcode.top_interview_questions.array.p26.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @Test
    public void test01() {
        int[] nums = {1, 1, 2};
        int i = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        Assert.assertEquals(2, i);
    }
    
    @Test
    public void test02() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        Assert.assertEquals(5, i);
    }
    
    @Test
    public void test03() {
        int[] nums = {1, 1, 1};
        int i = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        Assert.assertEquals(1, i);
    }
    
    @Test
    public void test04() {
        int[] nums = {0, 0, 1, 1, 2, 3, 3, 4, 5, 6, 6, 7};
        int i = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        Assert.assertEquals(8, i);
    }
}