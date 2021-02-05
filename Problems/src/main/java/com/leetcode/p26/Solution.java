package com.leetcode.p26;

//Given a sorted array nums, remove the duplicates in-place such that each eleme
//nt appears only once and returns the new length.
//
// Do not allocate extra space for another array, you must do this by modifying
//the input array in-place with O(1) extra memory.
//
// Clarification:
//
// Confused why the returned value is an integer but your answer is an array?
//
// Note that the input array is passed in by reference, which means a modificati
//on to the input array will be known to the caller as well.
//
// Internally you can think of this:
//
//
//// nums is passed in by reference. (i.e., without making a copy)
//int len = removeDuplicates(nums);
//
//// any modification to nums in your function would be known by the caller.
//// using the length returned by your function, it prints the first len element
//s.
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}
//
//
// Example 1:
//
//
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2]
//Explanation: Your function should return length = 2, with the first two elemen
//ts of nums being 1 and 2 respectively. It doesn't matter what you leave beyond t
//he returned length.
//
//
// Example 2:
//
//
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4]
//Explanation: Your function should return length = 5, with the first five eleme
//nts of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter
//what values are set beyond the returned length.
//
//
//
// Constraints:
//
//
// 0 <= nums.length <= 3 * 104
// -104 <= nums[i] <= 104
// nums is sorted in ascending order.
//
// Related Topics Array Two Pointers
// 👍 3470 👎 6391


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    public int removeDuplicates(int[] nums) {
        // 因为数组已经排序
        // 可以用两个指针遍历数组
        // 0,0,1,1,1,2,3
        // i 正常遍历
        // j 当i遇到不一样的时候 j++
        // nums[i]和nums[j]交换
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                j++;
                if (i != j) {
                    swap(nums, i, j);
                }
            }
        }
        return j + 1;
    }
    
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)