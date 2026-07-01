/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode rev(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null) {
           ListNode next = temp.next;
           temp.next = prev;
           prev = temp;
           temp = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid = middle(head);
        ListNode second = rev(mid.next);
        mid.next = null;
        ListNode first = head;
        while(second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;
            first.next = second;
            second.next = t1;
            first =  t1;
            second = t2;
        }
    }
}