// Last updated: 8/2/2025, 3:25:27 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) {
                    continue;
                }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum==target){
                        List<Integer> ans=new ArrayList<>();
                        ans.add(nums[i]);ans.add(nums[j]);ans.add(nums[k]);ans.add(nums[l]);
                        result.add(ans);
                        while(k<l && nums[k]==nums[k+1]) k++;
                         while(k<l && nums[l]==nums[l-1]) l--;
                        k++;
                        l--;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return result;
    }
}