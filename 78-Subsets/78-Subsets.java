// Last updated: 8/2/2025, 3:24:05 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ll,ans);
        return ans;
    }
    public static void helper(int[] nums,int idx,List<Integer> ll,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));
        
        for(int i=idx;i<nums.length;i++){
            ll.add(nums[i]);
            helper(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}