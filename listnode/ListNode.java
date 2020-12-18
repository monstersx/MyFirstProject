package com.learning.listnode;

import javax.xml.soap.Node;

//public class ListNode {
//    public Object data;
//    public Node next;
//
//    public ListNode(Object e) {
//        this.data = e;
//    }
//}

public class ListNode {
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
