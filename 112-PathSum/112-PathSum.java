// Last updated: 8/2/2025, 3:23:34 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return sum(root,targetSum,0);
    }
    private boolean sum(TreeNode node,int target,int curr){
        if(node==null){
            return false;
        }
        if (node.left == null && node.right == null) {
            return curr+node.val == target;
        }
        curr=curr+node.val;
        return sum(node.left,target,curr) || sum(node.right,target,curr);
        
        
        
    }
}