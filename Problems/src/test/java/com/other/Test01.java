package com.other;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    @Test
    public void test01() {
        boolean isAnagram = new Test01().isAnagram("silentt", "listent");
        Assert.assertTrue(isAnagram);
    }
    @Test
    public void test02() {
        boolean isAnagram = new Test01().isAnagram("evil", "live");
        Assert.assertTrue(isAnagram);
    }
    @Test
    public void test03() {
        boolean isAnagram = new Test01().isAnagram("evil1", "live");
        Assert.assertFalse(isAnagram);
    }
    
    public boolean isAnagram(String word1, String word2) {
        // 如果长度不同肯定不是
        if (word1.length() != word2.length()) {
            return false;
        }
        // 如果完全一致 那么也是
        if (word1.equals(word2)) {
            return true;
        }
        
        // 一般情况
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        setMap(word1, m1);
        setMap(word2, m2);
        
        for (Character key : m1.keySet()) {
            if (!m1.get(key).equals(m2.get(key))) {
                return false;
            }
        }
        return true;
    }
    
    private void setMap(String word1, Map<Character, Integer> m1) {
        for (int i = 0; i < word1.length(); i++) {
            
            char key1 = word1.charAt(i);
            Integer value1 = m1.get(key1);
            if (value1 == null) {
                value1 = 0;
            }
            m1.put(key1, ++value1);
        }
    }
}
