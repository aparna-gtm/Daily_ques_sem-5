// Last updated: 8/27/2025, 12:20:10 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        helper(root);
        return set.size()==1;
    }
    HashSet<Integer> set=new HashSet<>();
    public void helper(TreeNode root){
        if(root==null) return;
        set.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}