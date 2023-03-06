package leetcode.Easy228;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0};

        List<String> list = new ArrayList<>();
        int ing = 0;
        String result = "";
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                if (ing == 0) {
                    result = String.valueOf(nums[i]);
                }
                ing++;
                if (i + 1 == nums.length -1) {
                    list.add(result + "->" + nums[i + 1]);
                }
            } else {
                if (ing == 0) {
                    list.add(String.valueOf(nums[i]));
                    if (i + 1 == nums.length -1) {
                        list.add(String.valueOf(nums[i + 1]));
                    }
                } else {
                    list.add(result + "->" + nums[i]);
                    if (i + 1 == nums.length -1) {
                        list.add(String.valueOf(nums[i + 1]));
                    }
                    ing = 0;
                }
            }
        }
        if (nums.length == 1) list.add(String.valueOf(nums[0]));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}