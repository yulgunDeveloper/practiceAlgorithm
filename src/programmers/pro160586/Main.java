package programmers.pro160586;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA","BGZ"};

        int[] answer = new int[targets.length];
        Map<Character, Integer> charcMap = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            String str = keymap[i];
            for (int j = 0; j < str.length(); j++) {
                if (!charcMap.containsKey(str.charAt(j))) {
                    charcMap.put(str.charAt(j), j + 1);
                } else {
                    if (charcMap.get(str.charAt(j)) > (j + 1)) {
                        charcMap.put(str.charAt(j), j + 1);
                    }
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (charcMap.containsKey(targets[i].charAt(j))) {
                    answer[i] += charcMap.get(targets[i].charAt(j));
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
