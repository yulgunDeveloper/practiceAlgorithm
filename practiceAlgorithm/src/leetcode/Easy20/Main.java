package leetcode.Easy20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "(){}";
        List<String> list = new ArrayList<>();
        list.add("()");
        list.add("{}");
        list.add("[]");
        for (int i = 0; i < s.length(); i+=2) {
            String split = s.substring(i, i+2);
            System.out.println(split);
            if (!list.contains(split)) {
                System.out.println(false);
            }
       }
    }
}