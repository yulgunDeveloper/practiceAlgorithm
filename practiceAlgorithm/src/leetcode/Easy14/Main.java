package leetcode.Easy14;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = strs[0];
        int leng = result.length();
        for (int i = 1; i < strs.length; i++) {
            if (leng < strs[i].length()) {
                leng = strs[i].length();
            }
        }

    }
}