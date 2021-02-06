package com.leetcode.challenge2021.february.week1.p669;

import com.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class TrimBinarySearchTree {
    
    private Solution solution;
    
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @Test
    public void test01() {
        TreeNode l1 = new TreeNode(0);
        TreeNode r1 = new TreeNode(2);
        TreeNode root = new TreeNode(1, l1, r1);
        TreeNode treeNode = solution.trimBST(root, 0, 1);
        System.out.println(treeNode);
    }
}
//Given the root of a binary search tree and the lowest and highest boundaries a
//s low and high, trim the tree so that all its elements lies in [low, high]. Trim
//ming the tree should not change the relative structure of the elements that will
// remain in the tree (i.e., any node's descendant should remain a descendant). It
// can be proven that there is a unique answer.
//
// Return the root of the trimmed binary search tree. Note that the root may cha
//nge depending on the given bounds.
//
//
// Example 1:
//
//
//Input: root = [1,0,2], low = 1, high = 2
//Output: [1,null,2]
//
//
// Example 2:
//
//
//Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
//Output: [3,2,null,1]
//
//
// Example 3:
//
//
//Input: root = [1], low = 1, high = 2
//Output: [1]
//
//
// Example 4:
//
//
//Input: root = [1,null,2], low = 1, high = 3
//Output: [1,null,2]
//
//
// Example 5:
//
//
//Input: root = [1,null,2], low = 2, high = 4
//Output: [2]
//
//
//
// Constraints:
//
//
// The number of nodes in the tree in the range [1, 104].
// 0 <= Node.val <= 104
// The value of each node in the tree is unique.
// root is guaranteed to be a valid binary search tree.
// 0 <= low <= high <= 104
//
// Related Topics Tree Recursion
// 👍 2629 👎 208


//leetcode submit region begin(Prohibit modification and deletion)
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // 二叉搜索树的性质
        //  左子树的所有节点值小于根节点的值
        //  右子树的所有节点值大于根节点的值
        
        /*
         *           1
         *         /   \
         *       /       \
         *      0         2
         *     / \       / \
         *    /   \     /   \
         *  null null null null
         *
         * */
        
        // 递归结束条件 修剪到root为null
        // 也就是叶子节点的子树的根节点
        if (root == null) {
            return null;
        }
        // 区间[low,high]位于root的右子树
        // 则修剪后的二叉搜索树位于root的右子树
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        // 区间[low,high]位于root的左子树
        // 则修剪后的二叉搜索树位于root的左子树
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        // 区间[low,high]包含root节点
        // 则分别对root的左子树和右子树进行修剪
        // 修剪完成后分别赋给root的左、右节点
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        // 递归结束条件 修剪完成
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
