// Last updated: 8/13/2025, 10:02:14 PM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        camera=0;
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
     

    }
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }


        int left=minCamera(root.left);
        int right=minCamera(root.right);

        if(left==-1 || right==-1){ // is node pr camera ki need hai isliye -1
            camera++;
            return 1;
            // camera set up kara hai is node pr
        }
        else if(left==1 || right==1){ //inme is kisi ek ke pass  ya dono ke pass camera hai ya ek covered hai ek ke pass camera hai 
            return 0;
            // mtlb ye node covered hai already child ke through
        }
        else{
            return -1;
            //need a camera both the child l and r are covered only not have amera
        }



    }
}