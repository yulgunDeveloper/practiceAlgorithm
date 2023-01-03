package bakjun.bak2738;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] hang = new int[N][M];
        hang = twice(N, M, sc, hang, 0);
        hang = twice(N, M, sc, hang, 1);
        twice(N, M, sc, hang, 2);
    }

    public static int[][] twice(int N, int M, Scanner sc, int[][] hang, int time) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (time != 2) {
                    hang[i][j] += sc.nextInt();
                } else {
                    System.out.print(hang[i][j] + " ");
                }
            }
            if (time == 2) {
                System.out.println();
            }
        }
        return hang;
    }
}