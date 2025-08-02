// Last updated: 8/2/2025, 3:19:02 PM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return flipEq(root1,root2);
    }
    private boolean flipEq(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean flip=flipEq(root1.left, root2.right) && flipEq(root1.right, root2.left);
        boolean noflip=flipEq(root1.left, root2.left) && flipEq(root1.right, root2.right);
        return flip || noflip;

    }
}