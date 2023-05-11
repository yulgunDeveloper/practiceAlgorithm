package programmers.pro181893;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};


        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arrList.remove(arrList.size() - 1);
            } else {
                arrList.remove(0);
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
    }
}
