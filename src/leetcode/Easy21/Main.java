package leetcode.Easy21;

public class Main {
    public static void main(String[] args) {
        ListNode list2 = new ListNode();
        ListNode list1 = new ListNode(1, list2);
        System.out.println(list1.val);

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