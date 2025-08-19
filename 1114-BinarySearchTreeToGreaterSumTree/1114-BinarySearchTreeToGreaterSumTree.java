// Last updated: 8/19/2025, 7:34:10 AM
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
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
    int sum=0;
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.right);
        sum+=root.val;
        root.val=sum;
        helper(root.left);
    }
}