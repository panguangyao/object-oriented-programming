package cn.tommypoon.algorithm.easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Class21 {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        // if(list1 == null) return list2;
//        // if(list2 == null) return list1;
//        ListNode tmp =new ListNode(0);
//        ListNode cur = tmp;
//        while(list1 != null && list2 != null){
//            if(list1.val < list2.val){
//                cur.next = list1;
//                cur = cur.next;
//                list1 = cur.next;
//            }else{
//                cur.next = list2;
//                cur = cur.next;
//                list2 = cur.next;
//            }
//        };
//        if(list1 == null){
//            cur.next = list2;
//        } else {
//            cur.next = list1;
//        }
//
//        return tmp.next;
}
/*
21. 合并两个有序链表
简单
相关标签
相关企业
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。



示例 1：
    src/main/resources/images/class21.png

输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
示例 2：

输入：l1 = [], l2 = []
输出：[]
示例 3：

输入：l1 = [], l2 = [0]
输出：[0]


提示：

两个链表的节点数目范围是 [0, 50]
-100 <= Node.val <= 100
l1 和 l2 均按 非递减顺序 排列
 */