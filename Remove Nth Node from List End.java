/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode slow=A, fast=A;
        int count=0;
        if(B==0)
            B++;
        while(count<B && fast.next!=null){
            fast=fast.next;
            count++;
        }
        if(fast.next==null)
            return slow.next;
        else{
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
        return A;
    }
}
