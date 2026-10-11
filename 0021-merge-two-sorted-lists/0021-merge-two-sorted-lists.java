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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode(0);
        ListNode trav = head;

        while(list1 != null && list2 != null){
            int value;
            if(list1.val <= list2.val){
                value = list1.val;
                list1 = list1.next;
            }
            else{
                value = list2.val;
                list2 = list2.next;
            }
            ListNode temp = new ListNode(value);
            trav.next = temp;
            trav = temp;
        }

        while(list1 != null){
            ListNode temp = new ListNode(list1.val);
            trav.next = temp;
            trav = temp;
            list1 = list1.next;
        }

        while(list2 != null){
            ListNode temp = new ListNode(list2.val);
            trav.next = temp;
            trav = temp;
            list2 = list2.next;
        }

        return head.next;

    }
}