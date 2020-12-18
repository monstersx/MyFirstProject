package com.learning.listnode;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class MyListNode1st {
    public static void main(String[] args) {
        ListNode l1;
        l1 = new ListNode(2);


        System.out.println(l1);
    }


    ListNode head = new ListNode();

    public void addNode(ListNode listNode) {
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = listNode;
    }

    public void insertListNodeByIndex(int index, ListNode listnode) {
        if (index < 1 || index > length() + 1) {
            System.out.println("your index is illegal");
        }
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            if (index == length) {
                listnode.next = temp.next;
                temp.next = listnode;
                return;
            }
            temp = temp.next;
            length++;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = (l1 != null ? l1.val : 0);
            int l2Val = (l2 != null ? l2.val : 0);
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return root.next;
//        return new ListNode();
    }
}
