/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode A = head;
        if (A == null)
            return A;

        Map<RandomListNode, RandomListNode> mp = new HashMap<>(); // {original, copy}
        RandomListNode copyHead = new RandomListNode(A.label);
        mp.put(A, copyHead);
        RandomListNode copy = copyHead;
        A = A.next;

        while (A != null) {
            copy.next = new RandomListNode(A.label);
            copy = copy.next;
            mp.put(A, copy);
            A = A.next;
        }

        A = head;
        copy = copyHead;
        while (A != null) {
            if (A.random != null && mp.containsKey(A.random))
                copy.random = mp.get(A.random);
            copy = copy.next;
            A = A.next;
        }

        return copyHead;
    }
}
