// Last updated: 8/2/2025, 3:23:38 PM
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
    class isBalance{
        boolean isBal=true;
        int ht=-1;
    }
    public boolean isBalanced(TreeNode root) {
        return check(root).isBal;
    }
    public  isBalance check(TreeNode root){
        if(root==null){
            return new isBalance();
        }
        isBalance left=check(root.left);
        isBalance right=check(root.right);
        isBalance self=new isBalance();
        self.ht= Math.max(left.ht,right.ht)+1;
        boolean isok=Math.abs(left.ht-right.ht)<=1;
        self.isBal=left.isBal && right.isBal && isok;
        return self;
        
    }
}