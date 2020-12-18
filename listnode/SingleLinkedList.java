package com.learning.listnode;

//2.单向链表
public class SingleLinkedList<T> {
    //记录首节点
    private Node head;
    //记录链表长度
    private int length;

    //构造器
    public SingleLinkedList() {
        //初始化头节点
        this.head = new Node(null, null);
        //初始化元素个数
        this.length = length();
    }

    //清空单向链表
    public void clear() {
        head.next = null;
        this.length = 0;
    }

    //判断链表是否为空，是返回true，否返回false
    public boolean isEmpty() {
        return length == 0;
    }

    //获取链表中元素的个数
    public int length() {
        return length;
    }

    //读取并返回链表中的第i个元素的值
    public T get(int i) {
        //通过循环，从头节点开始往后找，依次找i次，就可以找到对应d元素
        Node temp = head.next;
        for (int index = 0; index < i; index++) {
            temp = temp.next;
        }
        return temp.data;
    }//这个方法可能有问题，当i=0时，会返回头节点后的第一个结点的值

    //返回链表中首次出现的指定的数据元素的位序号
    public int indexOf(T t) {
        //1.从头节点开始依次遍历每一个节点，取出data和t比较，如果相同就找到了
        Node temp = head;
        for (int i = 0; temp.next != null; i++) {
            temp = temp.next;
            if (temp.data.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    //在链表中添加一个元素
    public void add(T t) {
        //1.找到当前最后一个节点
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                //找到链表的最后
                break;
            }
            //没有找到最后，将temp后移
            temp = temp.next;
        }
        //2.创建新节点，保存元素t
        Node newNode = new Node(t, null);
        //3.让让最后一个节点指向新节点
        temp.next = newNode;
        //元素个数加1
        length++;
    }

    //在链表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i, T t) {
        //1.找到i 位置的前一个节点
        Node temp1 = head;
        for (int index = 0; index < i ; index++) {
            temp1 = temp1.next;
        }
        //2.找到i位置的后一个节点
        Node nextNode = temp1.next;
        //3.创建新节点,并指向 i位置的后一个节点
        Node newNode = new Node(t, nextNode);

        //4.i 位置的前一个节点指向新节点
        temp1.next = newNode;

        //5.元素个数加1
        length++;

    }

    //删除并返回链表中第i个数据元素
    public T remove(int i) {
        //1.找到i位置的前一个节点
        Node temp = head;
        for (int index = 0; index < i; index++) {
            temp = temp.next;
        }
        //2.找到i位置的节点
        Node currNode = temp.next;
        //3.找到i位置的后一个节点
        Node nextNode = currNode.next;
        //4.i位置的前一个节点指向i位置的后一个节点
        temp.next = nextNode;
        //5.元素个数减1
        length--;
        return currNode.data;
    }

    //显示链表
    public void showList() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头节点不能动，用temp用来辅助遍历
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println("\t" + temp.data);
        }
    }

    //1.节点类
    class Node {
        //储存数据
        T data;
        //指向下一个几点
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        //重写toString()方法
        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}


