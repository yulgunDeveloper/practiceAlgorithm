package programmers.pro120812;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};


        int answer = 0;
        int max = 0;
        Map<Integer, Integer> maxMap = new HashMap<>(); // array 값, 개수
        for (int i = 0; i < array.length; i++) {
            if (!maxMap.containsKey(array[i])) {
                maxMap.put(array[i], 1);
            } else {
                maxMap.put(array[i], maxMap.get(array[i]) + 1);
            }
        }
        for (int key: maxMap.keySet()) {
            if (maxMap.get(key) > max) {
                max = maxMap.get(key);
                if (answer == -1) {
                    answer = key;
                }
            } else if (max == maxMap.get(key)) {
                answer = -1;
            }
        }
        if (maxMap.size() == 1) answer = array[0];
        System.out.println(answer);
    }
}
