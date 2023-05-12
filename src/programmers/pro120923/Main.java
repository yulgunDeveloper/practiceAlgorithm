package programmers.pro120923;

public class Main {
    public static void main(String[] args) {
        int num = 3;
        int total = 12;

        int[] answer = new int[num];

        for (int i = 1; i < num; i++) {
            int count = 1;
            int sum = i;
            for (int j = i + 1; j < num; j++) {
                sum += j;
                count++;
                if (count == i) {

                }
            }
        }
    }
}
