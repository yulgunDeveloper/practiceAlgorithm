package programmers.pro155652;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s ="aukks";
        String skip = "wbqd";
        int index = 5;

        List<Character> skipList = new ArrayList<>();
        List<Character> result;
        String answer = "";


        for (int i = 0; i < skip.length(); i++) {
            char ch = skip.charAt(i);
            skipList.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            result = new ArrayList<>();
            char one = s.charAt(i);
            for (int j = 0; j < index; j++) {
                one++;
                if (one >= 123) one -= 26;
                if (!skipList.contains(one)) {
                    result.add(one);
                }
            }
            char last = result.get(result.size() - 1);
            if (result.size() < index) {
                int cnt = index - result.size();
                last += cnt;
                if (last >= 123) last -= 26;
            }
            answer += String.valueOf(last);
        }
        System.out.println(answer);
    }
}
