package leetcode.linkedlistandtree;

public class ReverseList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tempNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tempNode;
        }
        return pre;
    }
}
