package leetcode.Easy13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int length = s.length();
        String[] sList = new String[length];
        for (int i = 0; i < sList.length; i++) {
            sList[i] = s.substring(i, i+1);
        }

        int cnt = 0;
        int result = 0;

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> twoWordMap = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        twoWordMap.put("IV", 4);
        twoWordMap.put("IX", 9);
        twoWordMap.put("XL", 40);
        twoWordMap.put("XC", 90);
        twoWordMap.put("CD", 400);
        twoWordMap.put("CM", 900);
        while(cnt < length) {
            String compare="";
                compare = sList[cnt] + sList[cnt + 1];
            if (twoWordMap.containsKey(compare)) {
                result += twoWordMap.get(compare);
                cnt++;
            } else {
                result += map.get(sList[cnt]);
            }
            cnt++;
        }
        System.out.println(result);
    }
}