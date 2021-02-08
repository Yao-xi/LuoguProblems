package com.leetcode.challenge2021.february.week2;
//Given an Iterator class interface with methods: next() and hasNext(), design a
//nd implement a PeekingIterator that support the peek() operation -- it essential
//ly peek() at the element that will be returned by the next call to next(). 
//
// Example: 
//
// 
//Assume that the iterator is initialized to the beginning of the list: [1,2,3].
//
//
//Call next() gets you 1, the first element in the list.
//Now you call peek() and it returns 2, the next element. Calling next() after t
//hat still return 2. 
//You call next() the final time and it returns 3, the last element. 
//Calling hasNext() after that should return false.
// 
//
// Follow up: How would you extend your design to be generic and work with all t
//ypes, not just integer? 
// Related Topics Design 
// 👍 621 👎 440


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings("SimplifiableAssertion")
public class PeekingIteratorMain {
    
    PeekingIterator itr;
    
    @Before
    public void before() {
    
    }
    
    @Test
    public void test01() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        itr = new PeekingIterator(list.iterator());
        Assert.assertEquals(true, itr.hasNext());
        Assert.assertEquals(Integer.valueOf(1), itr.peek());
        Assert.assertEquals(Integer.valueOf(1), itr.next());
        Assert.assertEquals(true, itr.hasNext());
        Assert.assertEquals(Integer.valueOf(2), itr.peek());
        Assert.assertEquals(Integer.valueOf(2), itr.next());
        Assert.assertEquals(true, itr.hasNext());
        Assert.assertEquals(Integer.valueOf(3), itr.next());
        Assert.assertEquals(false, itr.hasNext());
    }
    
    @Test
    public void test02() {
        ArrayList<Integer> list = new ArrayList<>(Collections.emptyList());
        itr = new PeekingIterator(list.iterator());
        Assert.assertEquals(null, itr.peek());
        Assert.assertEquals(null, itr.next());
        Assert.assertEquals(false, itr.hasNext());
    }
    
}

//leetcode submit region begin(Prohibit modification and deletion)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> iterator;
    // 暂存下一个值用于peek
    private Integer next;
    private Integer nextNext;
    private boolean hasNext;
    
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (hasNext = iterator.hasNext()) {
            nextNext = iterator.next();
        }
    }
    
    @Override
    public boolean hasNext() {
        return hasNext;
    }
    
    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        next = nextNext;
        if (hasNext = iterator.hasNext()) {
            nextNext = iterator.next();
        }
        return next;
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextNext;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
