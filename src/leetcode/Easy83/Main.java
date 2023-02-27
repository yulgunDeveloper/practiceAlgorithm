package leetcode.Easy83;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        while (result != null && result.next != null) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}