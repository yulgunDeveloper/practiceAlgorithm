package programmers.pro142086;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "banana";

        Map<String, Integer> map = new HashMap<>(); // 알파벳, 없으면 추가되는 현재 i
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String what = String.valueOf(s.charAt(i));
            if (!map.containsKey(what)) {
                map.put(what, i);
                answer[i] = -1;
            } else {
                int where = map.get(what);
                where = i - where;
                answer[i] = where;
                map.put(what, i);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
