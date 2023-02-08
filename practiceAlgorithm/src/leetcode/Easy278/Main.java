package leetcode.Easy278;

public class Main extends VersionControl {
    public static void main(String[] args) {
        int n = 2126753390;

        int result = 0;
        while (isBadVersion(n)) {
            result = n;
            n--;
        }
        System.out.println(result);
    }
}

class VersionControl {
    static boolean isBadVersion(int version) {
        if (version >= 1702766719 && version <= 2126753390) {
            return true;
        } else {
            return false;
        }
    }
}