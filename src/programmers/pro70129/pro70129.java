package programmers.pro70129;

public class pro70129 {
    public static int[] solution(String s) {
        int[] answer = {};
        int eraseZeroCnt = 0;
        int loofCnt = 0;
        String eraseZero = "";
        String binary = s;
        while (!binary.equals("1")) {
            eraseZero = "";
            String arr[] = binary.split("");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("1")) {
                    eraseZero += arr[i];
                } else {
                    eraseZeroCnt++;
                }
            }
            binary = Integer.toBinaryString(eraseZero.length());
            loofCnt++;
        }
        answer = new int[]{loofCnt, eraseZeroCnt};
        return answer;
    }
    public static void main(String[] args) {
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        score = solution("1111111");
    }
}
