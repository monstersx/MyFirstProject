package com.leetcode.topic3;

import java.util.HashMap;

import static com.leetcode.topic3.Solution.lengthOfLongestSubstring;

public class Test {
    public static void main(String[] args) {
        //test case
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring("aaaaa"));
        System.out.println(lengthOfLongestSubstring("abcabd"));
        System.out.println(lengthOfLongestSubstring("aaabc"));
        System.out.println(lengthOfLongestSubstring("anviaj"));
        System.out.println(lengthOfLongestSubstring("abbab"));
        System.out.println(lengthOfLongestSubstring("xkdlaqwertayuiop5678"));
        System.out.println(lengthOfLongestSubstring("zxcaqwertayu"));
    }

    public static void QueryNums(String s) {
        if (s == "") {
            System.out.println("没有任何字符");
            return;
        }

        HashMap<Character, Integer> ci = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (ci.containsKey(s.charAt(i))) {
                ci.replace(s.charAt(i), ci.get(s.charAt(i)) + 1);
            } else ci.put(s.charAt(i), 1);
        }

        for (char c : ci.keySet()) {
            System.out.println(c + "出现了" + ci.get(c) + "次");
        }
    }//查询字符串每个字符的出现次数
}
