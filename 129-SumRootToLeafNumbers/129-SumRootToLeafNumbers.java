// Last updated: 8/2/2025, 3:23:23 PM
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
    static int t=0;
    public int sumNumbers(TreeNode root) {
        t=0;
        sum(root,0);
        return t;
    }
    
    private void sum(TreeNode root,int curr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            
            t+=curr*10 + root.val;
            return;
        }
        sum(root.left,curr*10+root.val);
        sum(root.right,curr*10+root.val);
    }
}