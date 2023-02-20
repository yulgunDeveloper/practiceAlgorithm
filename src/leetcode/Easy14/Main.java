package leetcode.Easy14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        if (strs == null || strs.length == 0) {
            System.out.println("");
        }
        if (strs.length == 1) {
            System.out.println(strs[0]);
        }
        Arrays.sort(strs);
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                prefix += strs[0].charAt(i);
            } else {
                break;
            }
        }
        System.out.println(prefix);
    }
}