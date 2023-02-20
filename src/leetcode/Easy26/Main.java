package leetcode.Easy26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2,4,6,6};
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                nums[list.size()] = nums[i];
                list.add(nums[i]);
            }
        }
        System.out.println(list.size());
    }
}