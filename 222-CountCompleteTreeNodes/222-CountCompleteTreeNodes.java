// Last updated: 8/5/2025, 10:13:30 PM
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
    public int countNodes(TreeNode root) {
        return count(root);
    }
    public  int count(TreeNode root){
        if(root==null){
            return 0;
        }
        // if(root.left==null && root.right==null){
        //     return 0;
        // }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }
}