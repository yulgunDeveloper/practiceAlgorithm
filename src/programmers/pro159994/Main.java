package programmers.pro159994;

public class Main {
    public static void main(String[] args) {
        String answer = "";

        String[] cards1 ={"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        int last1 = 0;
        int last2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (last1 < cards1.length && goal[i].equals(cards1[last1])) {
                last1++;
            } else if (last2 < cards2.length && goal[i].equals(cards2[last2])) {
                last2++;
            } else {
                System.out.println("No");
            }
        }
        System.out.println("Yes");
    }
}
