/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        if(A==null || A.next==null) 
            return A;
       
        ListNode slow=A;
        ListNode fast=A;
       
        while(fast!=null){
            if(slow.val==0 && (fast.val==0 || fast.val==1)){
                slow=slow.next;
                fast=fast.next;
            }
            else if(slow.val==1 && fast.val==1){
                fast=fast.next;
            }
            else if(slow.val==1 && fast.val==0){
                int temp=slow.val;
                slow.val=fast.val;
                fast.val=temp;
                slow=slow.next;
                fast=fast.next;
            }
        }
        return A;
    }
}
