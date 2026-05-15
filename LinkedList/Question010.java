package LinkedList;
import java.util.*;

public class Question010 {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        temp.next = head;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode ptr = prev.next;
            prev.next = cur.next;
            cur.next = cur.next.next;
            prev.next.next = ptr;
        }

        return temp.next;
    }


    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);
        head = reverseBetween(head, 2, 4);

        System.out.println("After Reversing:");
        printList(head);
    }
}
