package com.leetcode.uncategorized.p15;
//给你一个包含 n 个整数的数组 nums，
// 判断 nums 中是否存在三个元素 a，b，c ，
// 使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例：
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针
// 👍 2839 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        // 排序数组
        Arrays.sort(nums);
        // -4,-1,-1, 0, 1, 2
        //  ^  ^           ^
        //  i  l           r
        
        // 枚举数组中的元素
        for (int i = 0; i < nums.length; i++) {
            // 第一个数大于 0，后面的数都比它大，肯定不成立了
            if (nums[i] > 0) {
                break;
            }
            // 上一次枚举相同则跳过
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i]; // 目标值
            int left = i + 1, right = nums.length - 1;
            while (right > left) {
                if (nums[left] + nums[right] == target) {
                    // 添加到列表
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[right], nums[left])));
                    // 增加 left，减小 right，但是不能重复
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] < target) {
                    // 当结果小于目标值时,移动left
                    left++;
                } else {  // nums[left] + nums[right] > target
                    // 当结果大于目标值时,移动right
                    right--;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
