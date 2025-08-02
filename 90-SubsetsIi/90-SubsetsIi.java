// Last updated: 8/2/2025, 3:23:51 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
        int idx=0;
        helper(nums,idx,list,ans);
        return ans;
    }
    public static void helper(int[] nums,int idx,List<Integer> ll , List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));

        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            ll.add(nums[i]);
            helper(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}