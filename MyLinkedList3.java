package Lesson7;

public class MyLinkedList3 {




    //环形链表
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return false;
        }
        return true;
    }


    //返回环形链表开始入环的第一个节点
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }




    //相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode pl = headA;
        ListNode ps = headB;
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        while(ps != null){
            lenB++;
            ps = ps.next;
        }

        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0){
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }

        for(int i = 0;i < len;i++){
            pl = pl.next;
        }

        while(ps != pl && pl != null && ps != null){
            ps = ps.next;
            pl = pl.next;
        }

        if(pl == ps && pl != null){
            return pl;
        }
        return null;
    }
}
