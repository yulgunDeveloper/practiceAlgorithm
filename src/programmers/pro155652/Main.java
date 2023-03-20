package programmers.pro155652;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s ="eeefgaukks";
        String skip = "wbqd";
        int index = 5;

        List<Character> skipList = new ArrayList<>();
        List<Character> result;
        String answer = "";


        for (int i = 0; i < skip.length(); i++) {
            char ch = skip.charAt(i);
            if (!skipList.contains(ch)) {
                skipList.add(ch);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            result = new ArrayList<>();
            char one = s.charAt(i);
            for (int j = 0; j < index; j++) {
                one = isNotSkip(one);
                if (!skipList.contains(one)) {
                    result.add(one);
                }
            }
            char last = result.get(result.size() - 1);
            int cnt = index - result.size();
            if (cnt > 0) {
                last += cnt;
                if (last >= 123) last -= 26;
            }
            while (skipList.contains(last)) {
                last = isNotSkip(last);
            }
            answer += String.valueOf(last);
        }
        System.out.println(answer);
    }
    public static char isNotSkip(char ch) {
        ch++;
        if (ch >= 123) ch -= 26;
        return ch;
    }
}
