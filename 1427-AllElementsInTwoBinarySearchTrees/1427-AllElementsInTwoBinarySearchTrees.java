// Last updated: 8/27/2025, 12:19:41 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        helper(root1);
        helper(root2);
        Collections.sort(list);
        return list;
    }
    List<Integer> list=new ArrayList<>();
    public void helper(TreeNode root1){
        if(root1==null){
            return;
        }
        helper(root1.left);
        list.add(root1.val);
        helper(root1.right);
    }
}