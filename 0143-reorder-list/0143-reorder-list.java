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

    public ListNode reverse(ListNode head){
        ListNode prev = null; 
        ListNode curr = head;

        while(curr != null){
            head = curr;
            curr = head.next;
            head.next = prev;
            prev = head;
        }
        return head;
    }

    public void reorderList(ListNode head) {
        if(head.next == null || head.next.next == null)
            return;

        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;

        while(fast != null && fast.next != null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        temp.next = null;

        ListNode trav1 = head;
        ListNode trav2 = reverse(slow);
        ListNode dummy1 = head;
        ListNode dummy2 = trav2;

        while(dummy1.next != null){
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
            trav1.next = trav2;
            trav2.next = dummy1;
            trav1 = dummy1;
            trav2 = dummy2;
        }

        if(dummy2 != null){
            dummy1.next = dummy2;
        }
    }
}