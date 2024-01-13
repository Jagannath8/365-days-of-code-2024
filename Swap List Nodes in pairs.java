/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null ) 
            return null;

        if(A.next==null) 
            return A;

        ListNode start = new ListNode(0);
        start.next = A; 
        ListNode curr = start;
        while(curr.next != null && curr.next.next != null ){
            curr.next = swapPairs(curr.next, curr.next.next );
            curr = curr.next.next;
        }
        return start.next;
    }

    public ListNode swapPairs( ListNode p1, ListNode p2){
        p1.next = p2.next;
        p2.next = p1;
        return p2;
    }
}
