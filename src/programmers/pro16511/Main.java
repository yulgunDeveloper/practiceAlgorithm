package programmers.pro16511;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        int l = 4;
        int r = 17;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    list.add("0");
                } else {
                    list.add("1");
                }
            }
            if (list.size() >= r) {
                break;
            }
        }

        for (int i = l; i < r; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    list.add("0");
                } else {
                    list.add("1");
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
