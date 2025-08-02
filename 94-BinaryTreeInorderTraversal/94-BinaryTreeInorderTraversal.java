// Last updated: 8/2/2025, 3:23:49 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        print(root,ll);
        return ll;
    }
    public static void print(TreeNode root,List<Integer> ll){
        if(root==null){
            return;

        }
        if(root.left!=null){
            
            print(root.left,ll);
            
        }
        
        ll.add(root.val);
       
        if(root.right!=null){
            
            print(root.right,ll);
           
        }

    }
}