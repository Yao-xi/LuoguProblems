package com.leetcode.uncategorized.p594;

import com.leetcode.challenge2021.february.week1.p594.Solution;
import org.junit.*;
import org.junit.rules.TestName;

public class SolutionTest {
    
    @Rule
    public TestName name = new TestName();
    private long startTime;
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        startTime = System.currentTimeMillis();
    }
    
    @After
    public void tearDown() throws Exception {
        long endTime = System.currentTimeMillis();
        System.out.println("Test method: " + name.getMethodName() + " , time: " + (endTime - startTime) + "ms");
    }
    
    @Test
    public void findLHS1() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int lhs = solution.findLHS(nums);
        Assert.assertEquals(5, lhs);
    }
    
    @Test
    public void findLHS2() {
        int[] nums = {1, 2, 3, 4};
        int lhs = solution.findLHS(nums);
        Assert.assertEquals(2, lhs);
    }
    
    @Test
    public void findLHS3() {
        int[] nums = {1, 1, 1, 1};
        int lhs = solution.findLHS(nums);
        Assert.assertEquals(0, lhs);
    }
}