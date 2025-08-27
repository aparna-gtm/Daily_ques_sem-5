// Last updated: 8/27/2025, 12:19:17 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        return helper(root);
    }
    public boolean helper(TreeNode root){
        if(root==null) return true;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode node=q.poll();
                if(level%2==0 && node.val%2==0) return false;
                if(level%2!=0 && node.val%2!=0) return false; 
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                if(list.size()>=1){
                    if( level%2==0 && list.get(list.size()-1) >= node.val){
                        return false;
                    }
                    if(level%2!=0 && list.get(list.size()-1) <= node.val){
                        return false;
                    }
                    else{
                        list.add(node.val);
                    }
                }
                else{
                    list.add(node.val);
                }
            }
            
            level++;

        }
        return true;
    }
}