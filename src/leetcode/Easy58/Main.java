package leetcode.Easy58;

public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        String[] spli = s.split(" ");
        String lastWord = "";
        for (int i = spli.length - 1; i >= 0; i--) {
            if (!spli[i].equals(" ")) {
                lastWord = spli[i];
                System.out.println(lastWord.length());
            }
        }
    }
}