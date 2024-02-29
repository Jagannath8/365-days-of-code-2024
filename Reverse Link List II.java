/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || A.next == null || B == C) {
            return A;
        }
        
        ListNode temp = new ListNode(0);
        temp.next = A;
        ListNode prev = temp;
        int count = 1;
        while (count < B) {
            prev = prev.next;
            count++;
        }
        
        ListNode curr = prev.next;
        ListNode after = null;
        while (count < C) {
            after = curr.next;
            curr.next = after.next;
            after.next = prev.next;
            prev.next = after;
            count++;
        }
        return temp.next;
    }
}
