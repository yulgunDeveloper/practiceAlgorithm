package programmers.pro176963;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] answer = solution(name, yearning, photo);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (scoreMap.containsKey(photo[i][j])) {
                    score += scoreMap.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
