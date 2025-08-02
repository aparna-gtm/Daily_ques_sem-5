// Last updated: 8/2/2025, 3:20:10 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[nums.length+1];
        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]!=0){
                ans[0]=nums[i];
            }
            else{
                arr[nums[i]]++;
            }
            
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}