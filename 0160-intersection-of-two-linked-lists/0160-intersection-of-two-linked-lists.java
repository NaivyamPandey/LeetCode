/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode travA = headA;
        ListNode travB = headB;
        while(travA != travB){
            if(travA == null)
                travA = headB;
            else
                travA = travA.next;
            
            if(travB == null)
                travB = headA;
            else
                travB = travB.next;
        }
        return travB;
    }
}