package leetcode.Easy22;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode list = new ListNode(0);
        ListNode tail = list;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        System.out.println(list.next);
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}