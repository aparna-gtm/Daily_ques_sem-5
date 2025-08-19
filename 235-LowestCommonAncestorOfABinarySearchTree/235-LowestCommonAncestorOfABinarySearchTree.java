// Last updated: 8/19/2025, 7:37:35 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p,q);
    }
    
    public TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){

            return null;
        }
        if(root==p || root==q){
            return root;
        }
        if(root.val>p.val && root.val>q.val){
             return helper(root.left,p,q);
        } 
        
        else if(root.val<p.val && root.val<q.val){
            return helper(root.right,p,q);
        } 
        

        else {
            return root;
        }
         
    }
}