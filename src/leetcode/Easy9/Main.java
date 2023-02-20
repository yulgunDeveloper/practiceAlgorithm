package leetcode.Easy9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 1000030001;
        String xToStr = String.valueOf(x);
        int len = xToStr.length();
        String[] list = new String[xToStr.length()];
        if (x > 0) {
            for (int i = 0; i < xToStr.length(); i++) {
                list[i] = xToStr.substring(i, i + 1);
            }
            int cnt = len / 2;
            System.out.println(len);
            System.out.println(cnt);
            if (len % 2 != 1 && x >= 100) {
                cnt -= 1;
            }
            for (int i = 0; i <= cnt; i++) {
                if (!list[i].equals(list[len -1])) {
                    System.out.println(false);
                }
                len -= 1;
            }
            System.out.println(true);
        } else if (x == 0) {
            System.out.println(true);
        }
    }
}