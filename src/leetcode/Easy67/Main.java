package leetcode.Easy67;

public class Main {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int result = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = result;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            result = sum / 2;
        }
        if (result > 0) {
            sb.append(result);
        }
        System.out.println(sb.reverse());
    }
}