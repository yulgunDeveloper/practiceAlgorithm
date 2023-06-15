package programmers.pro120907;

public class Main {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};


        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            int a = Integer.valueOf(quiz[i].split(" ")[0]);
            int b = Integer.valueOf(quiz[i].split(" ")[2]);
            String pm = quiz[i].split(" ")[1];
            int c = Integer.valueOf(quiz[i].split(" ")[4]);
            if (pm.equals("-")) {
                if (a-b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (a+b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            if (a + b == c) {
                System.out.println(a);
            } else if (c - a == b){

            }
        }
    }
}
