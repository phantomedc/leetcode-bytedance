/*
 * Copyright © 2013-2019 Suning.com Co., Ltd.
 *
 * This file is part of leetcode-bytedance project.
 * You can not be copied and/or distributed without the express
 * permission of cloudytrace group.
 */
package leetcode.linkedlistandtree;

/**
 * leetcode-bytedance: ReverseList
 *
 * @author 何硕 (Employee ID: 18032496)
 * @version 1.0.0, 2019-04-15 08:41
 * @since 1.0.0, 2019-04-15 08:41
 */
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
