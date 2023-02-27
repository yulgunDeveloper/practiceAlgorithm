package leetcode.Easy168;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        int columnNumber = 703; // AAA

        List<Integer> list = new ArrayList<>();
        int quotient = 0;
        int remainder = 0;
        char c = 0;
        String result = "";
        quotient = columnNumber / 26;
        remainder = columnNumber % 26;
        System.out.println(quotient);
        System.out.println(remainder);
        if (quotient == 0) {
            c = (char) (columnNumber + 64);
            result = String.valueOf(c);
            System.out.println(result);
        } else {
//            c = (char) (quotient + 64);
//            result = String.valueOf(c);
//            c = (char) (remainder + 64);
//            result += String.valueOf(c);
//            System.out.println(result);

            System.out.println(list.get(0));
            System.out.println(quotient);
        }
    }
}