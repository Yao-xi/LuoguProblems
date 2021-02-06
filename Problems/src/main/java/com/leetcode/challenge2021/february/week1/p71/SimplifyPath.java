package com.leetcode.challenge2021.february.week1.p71;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class SimplifyPath {
    
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @Test
    public void test01() {
        String path = "/a/./b/../../c/";
        String out = "/c";
        String s = solution.simplifyPath(path);
        Assert.assertEquals(out, s);
    }
    @Test
    public void test02() {
        String path = "/home/";
        String out = "/home";
        String s = solution.simplifyPath(path);
        Assert.assertEquals(out, s);
    }
    @Test
    public void test03() {
        String path = "/home//foo/";
        String out = "/home/foo";
        String s = solution.simplifyPath(path);
        Assert.assertEquals(out, s);
    }
    @Test
    public void test04() {
        String path = "/../";
        String out = "/";
        String s = solution.simplifyPath(path);
        Assert.assertEquals(out, s);
    }
}

//Given a string path, which is an absolute path (starting with a slash '/') to
//a file or directory in a Unix-style file system, convert it to the simplified ca
//nonical path.
//
// In a Unix-style file system, a period '.' refers to the current directory, a
//double period '..' refers to the directory up a level, and any multiple consecut
//ive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any
// other format of periods such as '...' are treated as file/directory names.
//
// The canonical path should have the following format:
//
//
// The path starts with a single slash '/'.
// Any two directories are separated by a single slash '/'.
// The path does not end with a trailing '/'.
// The path only contains the directories on the path from the root directory to
// the target file or directory (i.e., no period '.' or double period '..')
//
//
// Return the simplified canonical path.
//
//
// Example 1:
//
//
//Input: path = "/home/"
//Output: "/home"
//Explanation: Note that there is no trailing slash after the last directory nam
//e.
//
//
// Example 2:
//
//
//Input: path = "/../"
//Output: "/"
//Explanation: Going one level up from the root directory is a no-op, as the roo
//t level is the highest level you can go.
//
//
// Example 3:
//
//
//Input: path = "/home//foo/"
//Output: "/home/foo"
//Explanation: In the canonical path, multiple consecutive slashes are replaced
//by a single one.
//
//
// Example 4:
//
//
//Input: path = "/a/./b/../../c/"
//Output: "/c"
//
//
//
// Constraints:
//
//
// 1 <= path.length <= 3000
// path consists of English letters, digits, period '.', slash '/' or '_'.
// path is a valid absolute Unix path.
//
// Related Topics String Stack
// 👍 128 👎 68


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        // Input: path = "/a/./b/../../c/"
        // Output: "/c"
        
        // 考虑按"/"拆分字符串 用栈存储
        // 遇到"."(当前目录)和空字符串(连续多个"/")则忽略
        // 遇到".."则出栈 其余的入栈
        // 最后遍历栈中的数据
        
        StringBuilder simplePath = new StringBuilder();
        
        // 按"/"拆分字符串
        String[] split = path.split("/");
        // 用栈存储
        Stack<String> stack = new Stack<>();
        for (String value : split) {
            // "."(当前目录)和空字符串(连续多个"/")则忽略
            if (!"".equals(value) && !".".equals(value)) {
                if ("..".equals(value)) {
                    // ".."则出栈
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    // 其余的入栈
                    stack.push(value);
                }
            }
        }
        // 遍历栈中的数据
        if (stack.isEmpty()) {
            // 特殊处理
            simplePath.append("/");
        }
        for (String s : stack) {
            simplePath.append("/").append(s);
        }
        return simplePath.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

