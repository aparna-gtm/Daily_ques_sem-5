// Last updated: 8/8/2025, 7:18:40 AM
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
    class bstPair{
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        boolean isbst=true;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root).isbst;
    }
    public bstPair helper(TreeNode root){
        if(root==null){
            return new bstPair();
        }
        bstPair left=helper(root.left);
        bstPair right=helper(root.right);
        bstPair self= new bstPair();
        self.min=Math.min(root.val,Math.min(left.min,right.min));
        self.max=Math.max(root.val,Math.max(left.max,right.max));
        self.isbst= left.isbst && right.isbst && left.max<root.val && root.val<right.min;
        return self;
    }
}