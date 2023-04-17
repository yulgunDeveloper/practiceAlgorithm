package programmers.pro155651;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[][] book_time = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
        String[][] book_time = {{"10:20", "12:30"},{"10:20", "12:30"},{"10:20", "12:30"}};

        int answer = 0;
        TreeMap<String, List<String>> timeMap = new TreeMap<>();
        int prevH = 0;
        int prevM = 0;
        int nowH = 0;
        int nowM = 0;
        for (int i = 0; i < book_time.length; i++) {
            List<String> list = new ArrayList<>();
            // 시작시간이 같은 경우
            if (timeMap.containsKey(book_time[i][0])) {
                list = timeMap.get(book_time[i][0]);
                list.add(book_time[i][1]);
                timeMap.put(book_time[i][0], list);
                continue;
            } else {
                list.add(book_time[i][1]);
                timeMap.put(book_time[i][0], list);
            }
        }

        String prevTime = "";
        for (String key : timeMap.keySet()) {
            List<String> list = timeMap.get(key);
            for (int i = 0; i < list.size(); i++) {
                if (prevTime.equals("")) {
                    prevTime = list.get(i);
                }
            }
        }
    }

    public static String changeTimeToH(String time) {
        return time.split(":")[0];
    }
    public static String changeTimeToM(String time) {
        return time.split(":")[1];
    }
}
