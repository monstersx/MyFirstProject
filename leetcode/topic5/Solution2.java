package com.leetcode.topic5;

import javax.security.auth.login.CredentialNotFoundException;
import java.lang.reflect.Array;

public class Solution2 {
    public String longestPalindrome2(String s) {
        if (s.length() < 2) {
            return s;
        }
        String ss = addChars(s, '#');
        int center = 0;
        int arm = 0;

        for (int i = 1; i < ss.length() - 1; i++) {
            if (centerSpread(ss, i, i + 1) > centerSpread(ss, i - 1, i + 1)) {
                if (centerSpread(ss, i, i + 1) > arm) {
                    arm = centerSpread(ss, i, i + 1);
                    center = i;
                }
            } else if (centerSpread(ss, i, i + 1) < centerSpread(ss, i - 1, i + 1)) {
                if (centerSpread(ss, i - 1, i + 1) > arm) {
                    arm = centerSpread(ss, i - 1, i + 1);
                    center = i;
                }
            }
        }
        String sss = deleteChars(ss, '#', center, arm);
        return sss;
    }

    public String addChars(String s, Character c) {
        char[] ss = s.toCharArray();
        s = "";
        for (Character cc : ss) {
            s += cc.toString().concat(c.toString());
        }
        s = c.toString().concat(s);
        return s;
    }

    public int centerSpread(String ss, int i, int j) {
        int len = 0;
        while (i >= 0 && j < ss.length() && ss.charAt(i) == ss.charAt(j)) {
            len = (j - i) / 2;
            i--;
            j++;
        }
        return len;
    }

    public String deleteChars(String s, Character c, int center, int arm) {
        String ss;
        ss = s.substring(center - arm, center + arm).replaceAll("#", "");
        return ss;
    }
}
