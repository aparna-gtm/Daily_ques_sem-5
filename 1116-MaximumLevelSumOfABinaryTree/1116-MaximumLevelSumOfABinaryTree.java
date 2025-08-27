// Last updated: 8/27/2025, 12:19:59 PM
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
    public int maxLevelSum(TreeNode root) {
      
        if(root==null) return 0;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        int lvl=0;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                sum+=node.val;
            }
            
            if(sum>max){
                max=sum;
                lvl=level;
            }
            level++;
        }
        return lvl;
    }
}