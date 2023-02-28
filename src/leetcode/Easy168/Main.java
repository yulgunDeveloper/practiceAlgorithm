package leetcode.Easy168;

public class Main {
    public static void main(String[] args) {
        int columnNumber = 701; // ZY

        String result = "";

        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            char character = (char) (remainder + 64);
            result = character + result;
            columnNumber = columnNumber / 26;
        }
        System.out.println(result);
    }
}