// Last updated: 8/2/2025, 3:22:03 PM
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
        return find(root,p,q);
    }
    public static TreeNode find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){

            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode left=find(root.left,p,q);
        TreeNode right=find(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else if(left==null){
            return right;
        }
        else{
            return left;
        }
    }
}