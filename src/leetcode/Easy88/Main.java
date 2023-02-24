package leetcode.Easy88;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;

        int k = 0;

        List<Integer> list = new ArrayList<>();
        for (int i=0;i < nums1.length;i++) {
            if (nums1[i] == 0) {
                if (k < n) {
                    nums1[i] = nums2[k];
                    k++;
                }
            }
            list.add(nums1[i]);
        }
        Arrays.sort(nums1);
    }
}