package com.leetcode.topic4;

import static com.leetcode.topic4.SecondSolution.findMedianSortedArrays2;
import static com.leetcode.topic4.Solution.findMedianSortedArrays;

public class Test {
    public static void main(String[] args) {
        //test case
        int[] nums1=new int[]{1,2,3,4,5,6,7,8};
        int[] nums2=new int[]{9};

        System.out.println(findMedianSortedArrays2(nums1, nums2));
    }
}
