package programmers.pro147355;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";

        int split = p.length();
        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i+split > t.length()) break;
            String sub = t.substring(i, i + split);
            long compareInt = Long.parseLong(sub);
            long pInt = Long.parseLong(p);
            if (compareInt <= pInt) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}