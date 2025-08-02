// Last updated: 8/2/2025, 3:22:36 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        maxdep=0;
        List<Integer> ll=new ArrayList<>();
        print(root,ll,1);
        return ll;
    }
    static int maxdep=0;
    public static void print(TreeNode root,List<Integer> ll,int lvl){
        if(root==null){
            return;
        }
        if(maxdep<lvl){
            ll.add(root.val);
            maxdep++;
        }
        print(root.right,ll,lvl+1);
        print(root.left,ll,lvl+1);
    }
}