package bakjun.bak2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int k = sc.nextInt();
                if (max <= k) {
                    max = k;
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((maxi + 1) + " " + (maxj + 1));
    }
}