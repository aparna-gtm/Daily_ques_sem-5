// Last updated: 8/2/2025, 3:23:43 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> mid=new LinkedList<Integer>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                   
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                    
                }
                mid.add(q.poll().val);
            }
            ans.add(mid);

        }
        return ans;
    }
}