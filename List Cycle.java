/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
        ListNode ans=null;
        while(a!=null){
            if(a.val<0){
                a.val=Math.abs(a.val);
                return a;
            }
            else{
                a.val=a.val*-1;
                a=a.next;
            }
        }
        ans=a;
        return ans;
	}
}
