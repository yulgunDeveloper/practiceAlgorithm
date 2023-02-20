package leetcode.Easy27;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        List<Integer> list = new ArrayList<>();
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count--;
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        System.out.println(count);
    }
}