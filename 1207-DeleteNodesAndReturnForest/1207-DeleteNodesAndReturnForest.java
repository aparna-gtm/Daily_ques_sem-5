// Last updated: 8/27/2025, 12:19:55 PM
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        helper( root, to_delete);
        if(!search(root.val,to_delete)){
            list.add(root);
        }
        return list;

    }
    List<TreeNode> list=new ArrayList<>();
    public TreeNode helper(TreeNode root,int[] del){
        if(root==null){
            return null;
        }
      
        boolean found=search(root.val,del);
        if(!found){
            root.left=helper(root.left,del);
            root.right=helper(root.right,del);
            return root;
        }
        else{
            root.left=helper(root.left,del);
            root.right=helper(root.right,del);
            if(root.left!=null){
                list.add(root.left);
            }
            if(root.right!=null){
                list.add(root.right);
            }
            return null;
        }
        
        

    }
    public boolean search(int root,int[] del){
        for(int i=0;i<del.length;i++){
            if(del[i]==root){
                return true;
            }
        }
        return false;
    }
}