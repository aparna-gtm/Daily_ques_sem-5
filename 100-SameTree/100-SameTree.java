// Last updated: 8/2/2025, 3:23:47 PM
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return check(p,q);
    }
    public boolean check(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null){
            return true;
        }
        if(n1==null || n2==null){
            return false;
        }
        if(n1.val!=n2.val ){
            return false;
        }
        boolean left=check(n1.left,n2.left);
        boolean right=check(n1.right,n2.right);
        return left&&right;
    }
}