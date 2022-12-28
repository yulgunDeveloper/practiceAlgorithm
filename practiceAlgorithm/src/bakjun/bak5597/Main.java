package bakjun.bak5597;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int j = 1;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != j) {
                System.out.println(j);
                j++;
                k++;
            }
            j++;
        }
        if (k < 2) {
            System.out.println(30);
        }
    }
}