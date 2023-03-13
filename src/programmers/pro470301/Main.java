package programmers.pro470301;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int sum = 0;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i);
            if (sum == n) {
                answer++;
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                sum += list.get(j);
                if (sum == n) {
                    answer++;
                    continue;
                }
            }
        }
        System.out.println(answer);
    }
}
