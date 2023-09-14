package programmers.pro154539;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};

        int[] answer = solution(numbers);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            boolean exist = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
