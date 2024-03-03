/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> output = new ArrayList<>();
        helper(A, output);
        return output;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> output){
        if(root==null)
            return;
        helper(root.left, output);
        output.add(root.val);
        helper(root.right, output);
    }
}
