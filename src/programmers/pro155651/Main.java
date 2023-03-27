package programmers.pro155651;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[][] book_time = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
        String[][] book_time = {{"10:20", "12:30"},{"10:20", "12:30"},{"10:20", "12:30"}};

        int answer = 0;
        TreeMap<String, String> timeMap = new TreeMap<>();
        int prevH = 0;
        int prevM = 0;
        int nowH = 0;
        int nowM = 0;
        for (int i = 0; i < book_time.length; i++) {
            if (timeMap.containsKey(book_time[i][0])) {
                answer++;
               // 시작 시간이 똑같은 경우 끝 시간 비교
                prevH = Integer.parseInt(changeTimeToH(timeMap.get(book_time[i][0])));
                prevM = Integer.parseInt(changeTimeToM(timeMap.get(book_time[i][0])));
                nowH = Integer.parseInt(changeTimeToH(book_time[i][1]));
                nowM = Integer.parseInt(changeTimeToM(book_time[i][1]));
                if (prevH == nowH) {
                    if (prevM < nowM) {
                        timeMap.put(book_time[i][0], book_time[i][1]);
                    }
                } else if (prevH < nowH) {
                    timeMap.put(book_time[i][0], book_time[i][1]);
                }
                continue;
            }
            timeMap.put(book_time[i][0], book_time[i][1]);
        }

        String prevTime = "";
        for (String key : timeMap.keySet()) {
            if (prevTime.equals("")) {
                prevTime = timeMap.get(key);
            } else {
                prevH = Integer.parseInt(changeTimeToH(prevTime));
                prevM = Integer.parseInt(changeTimeToM(prevTime));
                nowH = Integer.parseInt(changeTimeToH(key));
                nowM = Integer.parseInt(changeTimeToM(key));
                if (prevH == nowH) {
                    if (prevM > nowM) {
                        answer++;
                    } else if (prevM < nowM) {
                        answer++;
                    }
                } else {
                    answer++;
                }
                prevTime = timeMap.get(key);
            }
        }
        System.out.println(answer);
    }

    public static String changeTimeToH(String time) {
        return time.split(":")[0];
    }
    public static String changeTimeToM(String time) {
        return time.split(":")[1];
    }
}
