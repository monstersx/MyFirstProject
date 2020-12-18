package com.leetcode.topic4;
/*
给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？

示例 1：
输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2

示例 2：
输入：nums1 = [1,2], nums2 = [3,4]
输出：2.50000
解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5

示例 3：
输入：nums1 = [0,0], nums2 = [0,0]
输出：0.00000

示例 4：
输入：nums1 = [], nums2 = [1]
输出：1.00000

示例 5：
输入：nums1 = [2], nums2 = []
输出：2.00000

提示：
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0) {
            if (nums2.length  % 2 == 1) {
                return nums2[nums2.length / 2];
            }//奇数
            else if (nums2.length  % 2 == 0) {
                return ((double) nums2[nums2.length / 2] + (double) nums2[nums2.length / 2 - 1]) / 2;
            }//偶数
        } //m列为空时
        else if (nums2.length == 0 && nums1.length != 0) {
            if (nums1.length  % 2 == 1) {
                return nums1[nums1.length / 2];
            }//奇数
            else if (nums1.length  % 2 == 0) {
                return ((double) nums1[nums1.length / 2] + (double) nums1[nums1.length / 2 - 1]) / 2;
            }//偶数
        } //n列为空时

        int m = nums1.length, n = nums2.length;
        int mn = m + n;
        int[] nums = new int[m + n];

        int count = 0;
        int i = 0, j = 0;

        while (count != mn) {
            if (i != m && j != n && nums1[i] < nums2[j]) {
                nums[count] = nums1[i];
                count++;
                i++;
            } else if (i != m && j != n && nums1[i] >= nums2[j]) {
                nums[count] = nums2[j];
                count++;
                j++;
            }

            if (i == m && j != n) {
                nums[count] = nums2[j];
                count++;
                j++;
            }
            if (j == n && i != m) {
                nums[count] = nums1[i];
                count++;
                i++;
            }
        }

        if (mn % 2 == 1) {
            return nums[mn / 2];
        } else if (mn % 2 == 0) {
            return (nums[mn / 2] + nums[mn / 2 - 1]) / 2.0;
        }

        return 0;
    }
}
