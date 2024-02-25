/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, int B) {
        ListNode cur = A;
        ListNode nxt;
        ListNode prev = null;
        int k = B;
        while (k-- > 0 && cur != null) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }

        A.next = cur;
        k = B;
        A = prev;

        while (k-- > 0 && cur != null) {
            prev = cur;
            cur = cur.next;
        }

        if (cur != null) {
            prev.next = solve(cur, B);
        }

        return A;
    }
}
