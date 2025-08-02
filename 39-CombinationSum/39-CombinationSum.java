// Last updated: 8/2/2025, 3:24:59 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        int curr=0;
        helper(candidates,target,curr,0,ll,ans);
        return ans;
    }
    public static void helper(int[] nums,int target,int curr,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(curr==target){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(curr+nums[i]<=target){
                ll.add(nums[i]);
                helper(nums,target,curr+nums[i],i,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }

}