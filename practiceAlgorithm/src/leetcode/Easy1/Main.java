package leetcode.Easy1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<int[]> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 11};
        int target= 9;
        int N = nums.length;
        int M = 2;
        int[] arr= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
        boolean[] visited = new boolean[N];
        int output[] = new int [N];
        perm(arr, output, visited, 0, N, M);
        for (int i = 0; i < list.size(); i++) {
            if (nums[list.get(i)[0]] + nums[list.get(i)[1]] == target) {
                System.out.println("[" + list.get(i)[0] + "," + list.get(i)[1]);
            }
        }
    }
    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            int[] reList = new int[r];
            for(int i =0 ; i < r; i++) {
                reList[i] = output[i];
            }
            if (reList[0] < reList[1]) {
                list.add(reList);
            }
            return;
        }
        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
}