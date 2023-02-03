package leetcode.Easy21;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 1;

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}