/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode curr=A;
        while(curr!=null){
            pq.add(curr.val);
            curr=curr.next;
        }
        
        ListNode temp=new ListNode(pq.poll());
        A=temp;
        while(pq.isEmpty()==false){
            ListNode prev=new ListNode(pq.poll());
            temp.next=prev;
            temp=temp.next;
        }
        return A;
    }
}
