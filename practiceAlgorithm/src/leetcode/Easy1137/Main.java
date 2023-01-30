package leetcode.Easy1137;

public class Main {
    public static void main(String[] args) {
        int k = tribonacci(4);
        System.out.println(k);
    }
    public static int tribonacci(int n) {
        int t_0 = 0;
        int t_1 = 1;
        int t_2 = 1;
        int count = n;
        int[] lastTwo = {0, 1, 1};
        int last = lastTwo[0] + lastTwo[1] + lastTwo[2];
        if (n == 0) {
            return t_0;
        } else if (n == 1) {
            return t_1;
        } else if (n == 2) {
            return t_2;
        } else {
            count = n - 3;
            for (int i = 0; i < count; i++) {
                lastTwo[0] = lastTwo[1];
                lastTwo[1] = lastTwo[2];
                lastTwo[2] = last;
                last = lastTwo[0] + lastTwo[1] + lastTwo[2];
            }
            return last;
        }
    }
}