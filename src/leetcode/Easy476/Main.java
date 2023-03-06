package leetcode.Easy476;

public class Main {
    public static void main(String[] args) {
        int num = 3;

        String[] binary = Integer.toBinaryString(num).split("");
        String result = "";
        for (int i = 0; i < binary.length; i++) {
            if (binary[i].equals("0")) {
                binary[i] = "1";
            } else {
                binary[i] = "0";
            }
            if (!(i == 0 && binary[i].equals("0"))) {
                result += binary[i];
            }
        }
        if (num == 1) result = "0";
        int binToDec = Integer.parseInt(result, 2);
        System.out.println(binToDec);
    }
}