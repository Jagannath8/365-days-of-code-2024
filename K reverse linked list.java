/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if (A == null) 
            return null;

        ListNode curr = A;
        ListNode prev = null;
        int x = B;
        while (B-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        A.next = reverseList(curr, x);
        return prev;
    }
}
