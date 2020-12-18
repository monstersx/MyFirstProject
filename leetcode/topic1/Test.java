package com.leetcode.topic1;

import static com.leetcode.topic1.Solution.twoSum;

public class Test {
    public static void main(String[] args) {
        int[] nums=new int[]{3,3};
        int[] nums2=new int[]{5,3,3,2,1,7};
        queryArray(twoSum(nums, 6));
    }

    public static void queryArray(int[] nums){
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
