/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow = A, fast = A;
        Stack<Integer> s = new Stack<>();
        while (fast != null && fast.next != null) {
            s.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        
        while (!s.isEmpty()) {
            if (slow.val != s.peek()) {
                return 0;
            }
            slow = slow.next;
            s.pop();
        }

        return 1;
    }
}
