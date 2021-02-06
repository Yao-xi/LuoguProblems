package com.leetcode.challenge2021.february.week1.p191;

//Write a function that takes an unsigned integer and returns the number of '1'
//bits it has (also known as the Hamming weight).
//
// Note:
//
//
// Note that in some languages such as Java, there is no unsigned integer type.
//In this case, the input will be given as a signed integer type. It should not af
//fect your implementation, as the integer's internal binary representation is the
// same, whether it is signed or unsigned.
// In Java, the compiler represents the signed integers using 2's complement not
//ation. Therefore, in Example 3 above, the input represents the signed integer. -
//3.
//
//
// Follow up: If this function is called many times, how would you optimize it?
//
//
//
// Example 1:
//
//
//Input: n = 00000000000000000000000000001011
//Output: 3
//Explanation: The input binary string 00000000000000000000000000001011 has a to
//tal of three '1' bits.
//
//
// Example 2:
//
//
//Input: n = 00000000000000000000000010000000
//Output: 1
//Explanation: The input binary string 00000000000000000000000010000000 has a to
//tal of one '1' bit.
//
//
// Example 3:
//
//
//Input: n = 11111111111111111111111111111101
//Output: 31
//Explanation: The input binary string 11111111111111111111111111111101 has a to
//tal of thirty one '1' bits.
//
//
//
// Constraints:
//
//
// The input must be a binary string of length 32
//
// Related Topics Bit Manipulation
// 👍 1328 👎 608

/*求输入的无符号整数的二进制表示形式下的1的个数*/

//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 转二进制
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        // 计算s中'1'的个数
        int count = 0;
        for (char c : chars) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)