package leetcode.Easy69;

public class Main {
    public static void main(String[] args) {
        int x = 2147395600;
        int max = 1;
        long a = 0L;
        long b = 0L;
        for (int i = 0; i <= x; i++) {
            a = Long.valueOf(i) * Long.valueOf(i);
            b = Long.valueOf(max) * Long.valueOf(max);
            if (a <= x && b > x) {
                System.out.println(i);
            }
            max++;
        }
        System.out.println(max);
    }
}