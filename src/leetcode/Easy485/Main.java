package leetcode.Easy485;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0};

        int result = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                result++;
            } else {
                if (max == 0 || max < result) {
                    max = result;
                    result = 0;
                }
            }
            if (i == nums.length - 1 && result != 0) {
                if (max < result) {
                    max = result;
                }
            }
        }
        System.out.println(max);
    }
}