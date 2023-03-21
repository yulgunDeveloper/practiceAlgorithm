package leetcode.Easy28;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) return;
            String split = haystack.substring(i, i + needle.length());
            if (split.equals(needle)) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}