package leetcode.Easy35;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        if (map.containsKey(target)) {
            System.out.println(map.get(target));
        } else {
            map.put(target, 0);
        }
        int count = 0;
        for (int key: map.keySet()) {
            map.put(key, count);
            count++;
        }
        System.out.println(map.get(target));
    }
}