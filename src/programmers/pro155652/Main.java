package programmers.pro155652;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s ="aukks";
        String skip = "wbqd";
        int index = 5;

        String answer = "";
        List<Character> skipList = new ArrayList<>();
        int isSkip = 0;
        boolean tf = true;

        for (int i = 0; i < skip.length(); i++) {
            char skipCh = skip.charAt(i);
            skipList.add(skipCh);
        }

        for (int i = 0; i < s.length(); i++) {
            isSkip = 0;
            char compareCh = s.charAt(i);
            for (int j = 0; j < index; j++) {
                compareCh = isNotSkip(compareCh);
                if (skipList.contains(compareCh)){
                    isSkip++;
                }
            }
            compareCh += isSkip;
            if (compareCh >= 123) compareCh -= 26;
            if (skipList.contains(compareCh)) {
                while (tf) {
                    compareCh = isNotSkip(compareCh);
                    if (!skipList.contains(compareCh)) {
                        tf = false;
                    }
                }
            }
            answer += String.valueOf(compareCh);
        }
        System.out.println(answer);
    }

    public static char isNotSkip(char ch) {
        ch++;
        if (ch >= 123) ch -= 26;
        return ch;
    }
}
