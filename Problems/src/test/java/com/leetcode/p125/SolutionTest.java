package com.leetcode.p125;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void isPalindrome() {
        boolean t1 = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        Assert.assertTrue(t1);
        boolean t2 = new Solution().isPalindrome("race a car");
        Assert.assertFalse(t2);
    }
}