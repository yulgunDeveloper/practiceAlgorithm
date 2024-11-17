package programmers.pro120956;

import java.util.ArrayList;
import java.util.List;

public class pro120956 {
    public static int solution(String[] babbling) {
        int answer = 0;
        List<String> say = new ArrayList<>();
        say.add("aya");
        say.add("ye");
        say.add("woo");
        say.add("ma");
        for (int i = 0; i < babbling.length; i++) {
            int len = babbling[i].length();
            for (int j = 0; j < len; j++) {
                int start = 0;
                String sub1 = babbling[i].substring(start, 2);
                String sub2 = babbling[i].substring(start, 3);
                if (say.contains(sub1) || say.contains(sub2)) {

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling  = {"aya", "yee", "u", "maa", "wyeoo"};
        solution(babbling);
    }
}
