package programmers.pro161989;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = 8; // 영역
        int m = 4; // 롤러의 길이
        int[] section = {2, 3, 6};

        boolean[] tf = new boolean[n];
        int secInt = 0;
        for (int i = 0; i < tf.length; i++) {
            if (i == section[secInt] - 1) {
                tf[i] = false;
                if (section.length >= secInt) {
                    secInt++;
                }
            } else {
                tf[i] = true;
            }
        }

    }
}
