// Last updated: 8/2/2025, 3:21:54 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        preOrder(root,ll,"");
        return ll;
    }
    public static void preOrder(TreeNode root,List<String> ll,String s){
        if(root.left==null && root.right==null){
            s+=root.val;
            ll.add(s);
            return;
        }
        
        if(root.left!=null){
            preOrder(root.left,ll,s+root.val+"->");
        }
        if(root.right!=null){
            preOrder(root.right,ll,s+root.val+"->");
        }

    }
}