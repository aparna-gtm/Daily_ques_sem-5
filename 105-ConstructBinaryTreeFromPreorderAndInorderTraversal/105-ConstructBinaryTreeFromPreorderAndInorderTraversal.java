// Last updated: 8/13/2025, 10:08:16 PM
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(inorder,preorder,0,inorder.length-1,0,preorder.length-1);

    }
    public TreeNode createTree(int[] inorder,int[] preorder,int ilo ,int ihi, int plo, int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }

        TreeNode node=new TreeNode(preorder[plo]);
        int idx=search(inorder,ilo,ihi,preorder[plo]);
        int c=idx-ilo;
        node.left=createTree(inorder,preorder,ilo,idx-1,plo+1,plo+c);
        node.right=createTree(inorder,preorder,idx+1,ihi,plo+c+1,phi);
        return node;


    }
    public int search(int[] inorder,int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(inorder[i]==item){
                return i;
            }
        }
        return 0;// koi fark nahi isse cuz data will be there in array
    }
}