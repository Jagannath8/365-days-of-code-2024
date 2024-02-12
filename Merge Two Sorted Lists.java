/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode temp = new ListNode(0);
        ListNode output = temp;
        while(A!=null && B!=null){
            if(A.val>B.val){
                temp.next=B;
                B=B.next;
            }
            else{
                temp.next=A;
                A=A.next;
            }
            temp=temp.next;
        }
        
        if(A!=null)
            temp.next=A;
        if(B!=null)
            temp.next=B;
        return output.next;
    }
}
