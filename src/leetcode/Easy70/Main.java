package leetcode.Easy70;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        if (n <= 1) {
            System.out.println(1);
        }
        int[] list = new int[n+1];
        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i <= n; i++) {
            list[i] = list[i-1] + list[i-2];
        }
        System.out.println(list[n]);
    }
}