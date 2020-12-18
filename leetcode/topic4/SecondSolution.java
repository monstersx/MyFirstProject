package com.leetcode.topic4;

public class SecondSolution {
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, mn = nums1.length + nums2.length;
        int left = 0, right = 0;
        int lsum = 0, rsum = 0;

        for (int i = 0; i <= mn / 2; i++) {
            if (left < m && right < n) {
                if (nums1[left] < nums2[right]) {
                    rsum = nums1[left];
                    left++;
                } else if (nums1[left] >= nums2[right]) {
                    rsum = nums2[right];
                    right++;
                }
            } else if (left == m && right != n) {
                rsum = nums2[right];
                right++;
            } else if (right == n && left != m) {
                rsum = nums1[left];
                left++;
            }


            if (i > (mn - 3) / 2.0 && i < (mn - 1) / 2.0) {
                lsum = rsum;
            }//若mn是双数，找到中间位置靠左的数
        }

        if (mn % 2 == 0) {
            return (lsum + rsum) / 2.0;//偶数中位数
        } else return rsum;//奇数中位数
    }
}
