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
        String[] answer = new String[players.length];
        Map<String, Integer> numI = new HashMap<>();
        Map<Integer, String> nameMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            numI.put(players[i], i);
            nameMap.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            numI.put(callings[i], numI.get(callings[i]) - 1);
            String prevName = nameMap.get(numI.get(callings[i]));
            nameMap.put(numI.get(callings[i]), callings[i]);
            nameMap.put(numI.get(callings[i]) + 1, prevName);
            numI.put(prevName, numI.get(callings[i]) + 1);
        }
        for (int i = 0; i < players.length; i++) {
            answer[i] = nameMap.get(i);
        }
        return answer;
    }
}
