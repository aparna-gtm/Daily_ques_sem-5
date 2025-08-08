// Last updated: 8/8/2025, 7:16:24 AM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        return del(root,key);
    }
    public static TreeNode del(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left=del(root.left,key);
        }
        else if(key>root.val){
            root.right=del(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                int min=minimum(root.right);
                root.right=del(root.right,min);
                root.val=min;
            }
        }
        return root;
        
    }
    public static int minimum(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int l=minimum(root.left);
        return Math.min(root.val,l);
    }
}