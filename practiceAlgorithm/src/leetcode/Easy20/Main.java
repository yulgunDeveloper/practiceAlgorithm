package leetcode.Easy20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "({";

        String[] strList = s.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (strList[i].equals("(") || strList[i].equals("{") || strList[i].equals("[")) {
                list.add(strList[i]);
            } else {
                if (i == 0) System.out.println(false);
                if (strList[i].equals(")")) {
                    if (list.size() == 0) System.out.println(false);
                    if (!list.get(list.size() - 1).equals("(")) {
                        System.out.println(false);
                    } else {
                        list.remove(list.size() - 1);
                    }
                } else if (strList[i].equals("}")) {
                    if (list.size() == 0) System.out.println(false);
                    if (!list.get(list.size() - 1).equals("{")) {
                        System.out.println(false);
                    } else {
                        list.remove(list.size() - 1);
                    }
                } else if (strList[i].equals("]")) {
                    if (list.size() == 0) System.out.println(false);
                    if (!list.get(list.size() - 1).equals("[")) {
                        System.out.println(false);
                    } else {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        if (list.size() != 0) System.out.println(false);
        System.out.println(true);
    }
}