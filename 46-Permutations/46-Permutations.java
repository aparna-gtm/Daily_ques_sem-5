// Last updated: 8/2/2025, 3:24:50 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,ll,ans,visited);
        return ans;
    }
    public static void helper(int[] nums,List<Integer> ll,List<List<Integer>> ans,boolean[] visited){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true) continue;
            ll.add(nums[i]);
            visited[i]=true;
            helper(nums,ll,ans,visited);
            ll.remove(ll.size()-1);
            visited[i]=false;
        }
    }
}