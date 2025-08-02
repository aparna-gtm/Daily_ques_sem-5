// Last updated: 8/2/2025, 3:22:10 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // there can be atmost 2 elements for more than n/3 itmes so two candidates here

        List<Integer> ans=new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;
        if(nums.length==1){
            ans.add(nums[0]);
            
            return ans;
            
        }
        int candidate1=nums[0];
        int candidate2=nums[1];
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=nums[i];
                count1++;
            }
            else if(count2==0){
                candidate2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        if (count1 > nums.length / 3) ans.add(candidate1);
        if (count2 > nums.length / 3) ans.add(candidate2);

        return ans;

    }
}