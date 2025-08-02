// Last updated: 8/2/2025, 3:23:42 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        helper(root,q,ans);
        return ans;
    }
    public static void helper(TreeNode root,Queue<TreeNode> q,List<List<Integer>> ans){
        if(root==null) return;
        q.offer(root);
        int dir=0;
        
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> mid=new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                
                }
                mid.add(q.poll().val);
                
            }
            if(dir==1){
                Collections.reverse(mid);
                dir=0;
            }
            else{
                dir=1;
            }
            ans.add(mid);
        }

    }
}