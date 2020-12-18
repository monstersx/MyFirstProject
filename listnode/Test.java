package com.learning.listnode;
//https://blog.csdn.net/weixin_47254987/article/details/107610214

public class Test {
    public static void main(String[] args) {
        //创建单向链表
        SingleLinkedList<String>  linkedList = new SingleLinkedList<>();

        //测试数据插入
        linkedList.add("孙悟空");
        linkedList.add("猪八戒");
        linkedList.add("沙僧");
        linkedList.add("唐僧");

        //测试是否为空
        System.out.println("是否为空:"+linkedList.isEmpty());
        //测试获取个数
        System.out.println("链表元素个数："+linkedList.length());
        //测试获取
        System.out.println("获取到的元素："+linkedList.get(1));
        //测试指定数据首次出现位置
        System.out.println("第一次出现位置："+linkedList.indexOf("孙悟空"));
        //测试指定位置插入插入元素
        linkedList.insert(0,"白龙马");
        //测试遍历
        System.out.println("遍历结果：");
        linkedList.showList();
        //测试删除
        System.out.println("成功删除："+linkedList.remove(1));

    }
}
