package programmers.pro155652;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "zzzzzz";
        String skip = "fghijklmnopqrstuvwxy";
        int index = 7;
//        String s = "aukks";
//        String skip = "wbqd";
//        int index = 5;

        String answer = "";
        char ch = 'a';
        int intSkip = 0;
        boolean tf = true;
        List<String> alpaList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < skip.length(); i++) {
            char compare = skip.charAt(i);
            int where = compare - 97;
            skipList.add(where);
        }

        for (int i = 0; i < 26; i++) {
            alpaList.add(String.valueOf(ch));
            ch++;
        }
        for (int i = 0; i < s.length(); i++) {
            intSkip = 0;
            tf = true;
            char compare = s.charAt(i);
            int where = compare - 97;

            for (int j = 0; j < index; j++) {
                where++;
                if (where >= 26) {
                    where /= 26;
                    where--;
                }
                if (skipList.contains(where)) {
                    intSkip++;
                }
            }

            where += intSkip;
            if (where >= 26) {
                where /= 26;
                where--;
            }
            while (tf) {
                if (skipList.contains(where)) {
                    where++;
                    if (where >= 26) {
                        where /= 26;
                        where--;
                    }
                } else {
                    tf = false;
                }
            }
            answer += alpaList.get(where);
        }
        System.out.println(answer);
    }
}