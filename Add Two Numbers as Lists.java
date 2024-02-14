/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        if(A==null)
            return B;
        if(B==null)
            return A;
        
        int sum=0, carry=0;
        ListNode prev=new ListNode(-1);
        ListNode ans=prev;
        while(A!=null || B!=null || carry==1) {
            sum=0;
            if(A!=null) {
                sum+=A.val;
                A=A.next;
            }
            if(B!=null) {
                sum+=B.val;
                B=B.next;
            }
            sum+=carry;
            carry=0;
            prev.next=new ListNode(sum%10);
            prev=prev.next;
            carry=sum/10;
        }
        return ans.next;
    }
}
