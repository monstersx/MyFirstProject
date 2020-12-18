package com.leetcode.topic2;

import java.util.List;

import static com.leetcode.topic2.Solution.addTwoNumbers;

public class Test {
    public static void main(String[] args) {
        //testcase
        ListNode l1=new ListNode(0);
        addList(l1,1);
        addList(l1,0);
        addList(l1,9);
        ListNode l2=new ListNode(0);
        addList(l2,9);

        ListNode l3=addTwoNumbers(l1,l2);

        System.out.println(queryNums(l1));
        System.out.println(queryNums(l2));
        System.out.println(queryNums(l3));

    }

    public static ListNode addList(ListNode ln,int i){
        ListNode temp=ln;
        while (temp.next!=null){
            temp=temp.next;
        }
        ListNode newNode=new ListNode(i,null);
        temp.next=newNode;
        return temp;
    }

    public static int queryNums(ListNode ln){
        ListNode temp=ln;
        int sum=0;
        int i=0;
        while(temp.next!=null){
            temp=temp.next;
            int multi=(int)Math.pow(10,i);
            sum+=temp.val*multi;
            i++;
        }
        return sum;
    }
}
