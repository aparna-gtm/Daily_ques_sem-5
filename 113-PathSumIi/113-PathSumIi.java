// Last updated: 8/8/2025, 7:18:28 AM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> mid=new ArrayList<>();
        sum(root,targetSum,mid,0,list);
        return list;
    }
    private void sum(TreeNode node,int target,List<Integer> mid,int curr,List<List<Integer>> list){
        if(node==null){
            return;
        }
        if (node.left == null && node.right == null) {
            if(curr+node.val == target) {
                mid.add(node.val);
                list.add(new ArrayList<>(mid));
                mid.remove(mid.size()-1);
                return;
            }
        }
        curr=curr+node.val;
        mid.add(node.val);
        sum(node.left,target,mid,curr,list);
        
        sum(node.right,target,mid,curr,list);
        mid.remove(mid.size()-1);
        
        
        
        
        
    }
}