package programmers.pro120884;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int chicken = 1081;


        int result = 0;
        int cul = chicken;
        while(cul > 10) {
            result += cul / 10 + 1;
            cul = cul / 10;
            System.out.println(cul);
        }
        System.out.println(result);
    }
}
