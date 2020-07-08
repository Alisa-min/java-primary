package Lesson7;

import java.util.*;




public class MyLinkedList2 {
    //链表分割
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.val < x){
                if(bs == null){
                    bs = cur;
                    be = cur;
                }else{
                    be.next = cur;
                    be = be.next;
                }
            }else{
                if(as == null){
                    as = cur;
                    ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null){
            return as;
        }else{
            be.next = as;
        }
        if(ae != null){
            ae.next = null;
        }
        return bs;
    }
    //删除链表中的重复节点
    public ListNode deleteDuplication(ListNode pHead){
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
    //链表的回文结构
    public boolean chkPalindrome(ListNode A) {
        // write code here

        if(A == null){
            return false;
        }

        if(A.next == null){
            return true;
        }
        ListNode fast = A;
        ListNode slow = A;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(A != slow){
            if(slow.val != A.val){
                return false;
            }
            if(A.next == slow){
                return true;
            }
            slow = slow.next;
            A = A.next;
        }
        return true;
    }

}
