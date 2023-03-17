package programmers.pro150370;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        Map<String, Integer> termsMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            String[] spl = terms[i].split(" ");
            termsMap.put(spl[0], Integer.valueOf(spl[1]));
        }
        termsMap.put("y", Integer.valueOf(today.substring(0, 4)));
        if (today.substring(5, 7).split("").equals("0")) {
            termsMap.put("m", Integer.valueOf(today.substring(5, 7).split("")[1]));
        } else {
            termsMap.put("m", Integer.valueOf(today.substring(5, 7)));
        }
        if (today.substring(8, 10).split("").equals("0")) {
            termsMap.put("d", Integer.valueOf(today.substring(8, 10).split("")[1]));
        } else {
            termsMap.put("d", Integer.valueOf(today.substring(8, 10)));
        }

        int resultY = 0;
        int resultM = 0;
        int resultD = 0;
        for (int i = 0; i < privacies.length; i++) {
            // Y : date[0], M : date[1], D : date[2]
            String date = privacies[i].split(" ")[0];
            int term = termsMap.get(privacies[i].split(" ")[1]);

            int plusY = term / 12;
            int plusM = term % 12;

            resultY = Integer.valueOf(date.substring(0,4)) + plusY;
            if (date.substring(5,7).split("").equals("0")) {
                resultM = Integer.valueOf(date.substring(5,7).split("")[1]) + plusM;
            } else {
                resultM = Integer.valueOf(date.substring(5,7)) + plusM;
            }
            if (date.substring(8,10).split("").equals("0")) {
                resultD = Integer.valueOf(date.substring(8,10).split("")[1]);
            } else {
                resultD = Integer.valueOf(date.substring(8,10));
            }

            if (resultM > 12) {
                resultM -= 12;
                resultY++;
            }

            if (termsMap.get("y") < resultY) {
                continue;
            } else if (termsMap.get("y") == resultY) {
                if (termsMap.get("m") < resultM) {
                    continue;
                } else if (termsMap.get("m") == resultM) {
                    if (termsMap.get("d") < resultD) {
                        continue;
                    } else if (termsMap.get("d") >= resultD) {
                        result.add(i + 1);
                    }
                } else {
                    result.add(i + 1);
                    continue;
                }
            } else {
                result.add(i + 1);
                continue;
            }
        }

        int[] answer = {};
        if (result.size() != 0) {
            answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
