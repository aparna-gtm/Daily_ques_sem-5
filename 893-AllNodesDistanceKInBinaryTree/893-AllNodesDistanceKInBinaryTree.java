// Last updated: 8/27/2025, 12:20:28 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        helper(root);
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target); 
        q.add(target);
        
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(level==k){
                while(!q.isEmpty()){
                    ans.add(q.poll().val);
                }
                    return ans;
            }
            for(int i=0;i<size;i++){
                
                TreeNode nn=q.poll();
                if(nn.left!=null && !visited.contains(nn.left)){
                    q.add(nn.left);
                    visited.add(nn.left);
                }
                if(nn.right!=null && !visited.contains(nn.right)){
                    q.add(nn.right);
                    visited.add(nn.right);
                }
                if(map.containsKey(nn) && !visited.contains(map.get(nn))){
                    q.add(map.get(nn));
                    visited.add(map.get(nn));
                }
                
                
            }
            level++;
            
        }
        return ans;

    }
    HashMap<TreeNode,TreeNode> map=new HashMap<>();
    public void helper(TreeNode root){
        if(root==null) return;

        if(root.left!=null){
            map.put(root.left,root);
        }
        helper(root.left);
        if(root.right!=null){
            map.put(root.right,root);
        }
        helper(root.right);

    }
}