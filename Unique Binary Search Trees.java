/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ArrayList<TreeNode> generateTrees(int a) {
		return helper(1,a);
	}
	
	ArrayList<TreeNode> helper(int start, int end){
		ArrayList<TreeNode> li=new ArrayList<>();
		if(start>end){
			li.add(null);
			return li;
		}
		
		for(int i=start;i<=end;i++){
			ArrayList<TreeNode> leftTree=helper(start, i-1);
			ArrayList<TreeNode> rightTree=helper(i+1, end);
			for(int j=0;j<leftTree.size();j++){
				TreeNode left=leftTree.get(j);
				for(int k=0;k<rightTree.size();k++){
					TreeNode right=rightTree.get(k);
					TreeNode node=new TreeNode(i);
					node.left=left;
					node.right=right;
					li.add(node);
				}
			}
		}
		return li;
	}
}
