package leetcode.Easy66;

public class Main {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] digits2 = new int[digits.length + 1];
        int plus = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i]++;
            }
            System.out.println(digits[i]);
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i == 0) {
                    plus++;
                } else {
                    digits[i - 1]++;
                }
            }
        }
        if (plus == 1) {
            digits2[0] = 1;
            for (int i = 1; i < digits2.length; i++) {
                digits2[i] = digits[i - 1];
            }
            System.out.println(digits2);
        } else {
            System.out.println(digits);
        }
    }
}