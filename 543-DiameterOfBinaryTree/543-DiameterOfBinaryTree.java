// Last updated: 8/2/2025, 3:20:24 PM
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
    class DiaPair{
        int dia=0;
        int ht=-1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
    public DiaPair diameter(TreeNode root){
        if(root==null){
            return new DiaPair();
        }
        DiaPair ldp=diameter(root.left);
        DiaPair rdp=diameter(root.right);
        DiaPair sdp=new DiaPair();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        int sd= ldp.ht +rdp.ht +2;
        sdp.dia=Math.max(sd,Math.max(ldp.dia,rdp.dia));
        return sdp;

    }
}