package leetcode.Easy70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 3;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(1);
            list.add(2);
        }
        Collections.sort(list);

        int sum = 0;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
    }
}