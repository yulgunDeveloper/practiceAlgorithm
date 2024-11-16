package programmers.pro138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pro138477 {
    public static int[] solution(int k, int[] score) {
        int[] answer = score;
        List<Integer> topList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i <= k - 1) {
                topList.add(score[i]);
            } else {
                for (int j = 0; j < topList.size(); j++) {
                    if (topList.get(j) < score[i]) {
                        topList.remove(j);
                        topList.add(score[i]);
                        break;
                    }
                }
            }
            Collections.sort(topList);
            answer[i] = topList.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        solution(4, score);
    }
}
