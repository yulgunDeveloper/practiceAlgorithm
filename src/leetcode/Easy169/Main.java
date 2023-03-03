package leetcode.Easy169;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        Integer maxValue = Collections.max(map.values());
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxValue) {
                System.out.println(key);
            }
        }
    }
}