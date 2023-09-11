package programmers.pro178871;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] answer = solution(players, callings);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(callings[i])) {
                    String prev = players[j - 1];
                    players[j - 1] = callings[i];
                    players[j] = prev;
                    break;
                }
            }
        }
        answer = players;
        return answer;
    }
}
